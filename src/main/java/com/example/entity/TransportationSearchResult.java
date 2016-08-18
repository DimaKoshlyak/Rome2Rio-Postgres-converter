package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

/**
 * Created by vlad on 8/14/16.
 */

@Entity
@Table(name = "transportationsmock")
public class TransportationSearchResult implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "search_result_id")
    private int id;

    @Column(name = "departure_city")
    private String departureCity;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "departure_station")
    private String departureStation;

    @Column(name = "departure_date_time")
    private Calendar departureDateTime;

    @Column(name = "arrival_station")
    private String arrivalStation;

    @Column(name = "arrival_date_time")
    private Calendar arrivalDateTime;

    @Column(name = "total_duration")
    private int totalDuration;

    @Column(name = "total_distance")
    private double totalDistance;

    @Column(name = "total_price")
    private double totalPrice;

    private String currency;
    private boolean selected;


//    @OneToMany(mappedBy = "transportationSearchResult")
    @OneToMany
    @JoinTable(
            name="transportationsmock_intervals",
            joinColumns = @JoinColumn( name="search_result_id"),
            inverseJoinColumns = @JoinColumn( name="interval_id")
    )
    private List<TransportationInterval> intervals;

    @Column(name = "transport_type_list")
    private String transportTypeList;

    public TransportationSearchResult() {
    }

    public String getTransportTypeList() {
        return transportTypeList;
    }

    public void setTransportTypeList(String transportTypeList) {
        this.transportTypeList = transportTypeList;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<TransportationInterval> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<TransportationInterval> intervals) {
        this.intervals = intervals;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
}
