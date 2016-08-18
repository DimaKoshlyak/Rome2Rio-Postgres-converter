package com.example.endpoint;

import com.example.transformer.R2RTransformer;
import com.example.entity.TransportationInterval;
import com.example.entity.TransportationSearchResult;
import com.example.r2rPojos.SearchRouteResponse;
import com.example.service.TransportService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;


/**
 * Created by dima on 15.08.16.
 */

@RequestMapping("/db")
@RestController
public class DatabaseEndpoint {

    @Inject
    private TransportService transportService;

    @Inject
    private R2RTransformer transformer;

    @RequestMapping(path = "/addtransport",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json")
    public
    @ResponseBody
    List<TransportationSearchResult> addTransportations(@RequestBody SearchRouteResponse response) {
        List<TransportationSearchResult> resultList = transformer.transform(response);
        for(TransportationSearchResult value:resultList){
            List<TransportationInterval> intervals = value.getIntervals();

            for(TransportationInterval interval:intervals){
                transportService.saveIntervalToDB(interval);
            }
            transportService.saveSearchResultToDB(value);
        }
        return transformer.transform(response);
    }

//    @Inject
//    private SaveAccommodationsInDBImpl saveAccommodationsInDB;
//
//    @RequestMapping(path = "/addhotels",
//            method = RequestMethod.POST,
//            consumes = "application/json",
//            produces = "application/json")
//    public
//    @ResponseBody
//    List<AccommodationResponse> addAccommodations(@RequestBody List<AccommodationResponse> response) {
//
//        List<AccommodationResponse> newList = new ArrayList<>();
//        for (AccommodationResponse value : response) {
//            if (value.getMinPrice().signum() > 0) {
//                newList.add(value);
//            }
//        }
//        newList.forEach(value -> saveAccommodationsInDB.save(value));
//        return response;
//    }
}
