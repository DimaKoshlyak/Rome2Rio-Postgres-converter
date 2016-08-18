package com.example.entity;//package net.tripcomposer.core.database;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Dima Koshlyak on 18.02.16.
 */

public class SearchAccommodationResponse implements Serializable {

    private String sessionId; //uses for TravelLifePro requests

//    private List<AccommodationResponse> hotelsList;

    public SearchAccommodationResponse() {
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

//    public List<AccommodationResponse> getHotelsList() {
//        return hotelsList;
//    }
//
//    public void setHotelsList(List<AccommodationResponse> hotelsList) {
//        this.hotelsList = hotelsList;
//    }
}
