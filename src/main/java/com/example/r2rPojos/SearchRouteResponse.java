package com.example.r2rPojos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 21.03.16.
 */
@ApiModel(value = "SearchRouteResponse", description = "Representation of common search rome2rio response")
public class SearchRouteResponse implements Serializable{

    private String departureCity;
    private String arrivalCity;

    @ApiModelProperty(value = "List of Rome2Rio places", required = true)
    private List<Rome2RioPlace> places;

    @ApiModelProperty(value = "List of Rome2Rio airports", required = true)
    private List<Rome2RioAirport> airports;

    @ApiModelProperty(value = "List of Rome2Rio airlines", required = true)
    private List<Rome2RioAirline> airlines;

    @ApiModelProperty(value = "List of Rome2Rio aircrafts", required = true)
    private List<Rome2RioAircraft> aircrafts;

    @ApiModelProperty(value = "List of Rome2Rio agencies", required = true)
    private List<Rome2RioAgency> agencies;

    @ApiModelProperty(value = "List of Rome2Rio routes", required = true)
    private List<Rome2RioRoute> routes;

    @ApiModelProperty(value = "Caller supplied data string", required = true)
    private String data;

    public SearchRouteResponse() {
    }

    public List<Rome2RioPlace> getPlaces() {
        return places;
    }

    public void setPlaces(List<Rome2RioPlace> places) {
        this.places = places;
    }

    public List<Rome2RioAirport> getAirports() {
        return airports;
    }

    public void setAirports(List<Rome2RioAirport> airports) {
        this.airports = airports;
    }

    public List<Rome2RioAirline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Rome2RioAirline> airlines) {
        this.airlines = airlines;
    }

    public List<Rome2RioAircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Rome2RioAircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public List<Rome2RioAgency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Rome2RioAgency> agencies) {
        this.agencies = agencies;
    }

    public List<Rome2RioRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Rome2RioRoute> routes) {
        this.routes = routes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
