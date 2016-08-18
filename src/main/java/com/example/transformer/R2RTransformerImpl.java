package com.example.transformer;

import com.example.entity.TransportType;
import com.example.entity.TransportationInterval;
import com.example.entity.TransportationSearchResult;
import com.example.r2rPojos.Rome2RioRoute;
import com.example.r2rPojos.RouteSegment;
import com.example.r2rPojos.SearchRouteResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by dima on 17.08.16.
 */

@Service
public class R2RTransformerImpl implements R2RTransformer {

    @Override
    public List<TransportationSearchResult> transform(SearchRouteResponse response) {
        List<TransportationSearchResult> result = new ArrayList<>();
        if (response != null) {
            List<Rome2RioRoute> rome2RioRouteList = response.getRoutes();
            if (rome2RioRouteList != null && !rome2RioRouteList.isEmpty()) {
                rome2RioRouteList.forEach(value -> {
                    TransportationSearchResult transport = transform(value);
                    transport.setArrivalCity(response.getArrivalCity());
                    transport.setDepartureCity(response.getDepartureCity());
                    result.add(transport);
                });
            }
        }
        return result;
    }

    private TransportationSearchResult transform(Rome2RioRoute route) {
        TransportationSearchResult result = new TransportationSearchResult();
        if (route != null) {
            List<RouteSegment> segments = route.getSegments();
            if (segments != null && !segments.isEmpty()) {
                result.setDepartureStation(segments.get(0).getsName());
                result.setArrivalStation(segments.get(segments.size() - 1).gettName());
                result.setTotalDistance(route.getRouteDistance());
                result.setTotalDuration((int) route.getRouteDuration());
                result.setTotalPrice(route.getRoutePrice());
                result.setSelected(false);
                result.setCurrency(route.getRouteCurrency());

                StringJoiner string = new StringJoiner(",");
                List<TransportationInterval> intervals = new ArrayList<>(segments.size());
                segments.forEach(value -> {
                    intervals.add(transform(value));
                    string.add(value.getKind());
                });
                result.setIntervals(intervals);
                result.setTransportTypeList(string.toString());
            }
        }
        return result;
    }

    private TransportationInterval transform(RouteSegment segment) {
        TransportationInterval result = new TransportationInterval();
        if (segment != null) {
            if (segment.getKind().equals("flight")) {
                result.setDepartureStation(segment.getsCode());
                result.setArrivalStation(segment.gettCode());
            } else {
                result.setDepartureStation(segment.getsName());
                result.setArrivalStation(segment.gettName());
            }
            TransportType type = getTransportType(segment.getKind());
            result.setTransportType(type.getValue());
            result.setIntervalDuration((int) segment.getDuration());
            result.setIntervalDistance(segment.getDistance());
            result.setIntervalPrice(segment.getSegmentPrice());
        }
        return result;
    }

    private TransportType getTransportType(String transportType) {
        TransportType result;
        switch (transportType) {
            case "train":
                result = TransportType.TRAIN;
                break;
            case "flight":
                result = TransportType.FLIGHT;
                break;
            case "rideshare":
                result = TransportType.RIDESHARE;
                break;
            case "bus":
                result = TransportType.BUS;
                break;
            default:
                result = TransportType.UNDEFINED;
                break;
        }
        return result;
    }
}
