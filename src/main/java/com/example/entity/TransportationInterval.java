package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by dima on 17.08.16.
 */

@Entity
@Table(name = "intervalsmock")
public class TransportationInterval implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "interval_id")
    private int id;

    @Column(name = "departure_station")
    private String departureStation;

    @Column(name = "departure_date_time")
    private Calendar departureDateTime;

    @Column(name = "arrival_station")
    private String arrivalStation;

    @Column(name = "arrival_date_time")
    private Calendar arrivalDateTime;

    @Column(name = "transport_type")
    private String transportType;

    @Column(name = "provider")
    private String provider;

    @Column(name = "interval_duration")
    private int intervalDuration;

    @Column(name = "interval_distance")
    private double intervalDistance;

    @Column(name = "interval_price")
    private double intervalPrice;

//    @ManyToOne
//    @JoinTable(
//            name = "transportationsmock_intervals",
//            joinColumns = @JoinColumn(name = "intervals_id"),
//            inverseJoinColumns = @JoinColumn(name = "transportation_search_result_id")
//    )
//    private TransportationSearchResult transportationSearchResult;

    public TransportationInterval() {
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public Calendar getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Calendar departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Calendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(Calendar arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getIntervalDuration() {
        return intervalDuration;
    }

    public void setIntervalDuration(int intervalDuration) {
        this.intervalDuration = intervalDuration;
    }

    public double getIntervalDistance() {
        return intervalDistance;
    }

    public void setIntervalDistance(double intervalDistance) {
        this.intervalDistance = intervalDistance;
    }

    public double getIntervalPrice() {
        return intervalPrice;
    }

    public void setIntervalPrice(double intervalPrice) {
        this.intervalPrice = intervalPrice;
    }

//    public TransportationSearchResult getTransportationSearchResult() {
//        return transportationSearchResult;
//    }
//
//    public void setTransportationSearchResult(TransportationSearchResult transportationSearchResult) {
//        this.transportationSearchResult = transportationSearchResult;
//    }
}
