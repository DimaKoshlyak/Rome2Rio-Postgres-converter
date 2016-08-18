package com.example.service;

import com.example.entity.TransportationInterval;
import com.example.entity.TransportationSearchResult;

/**
 * Created by dima on 17.08.16.
 */
public interface TransportService {

    void saveSearchResultToDB(TransportationSearchResult result);

    void saveIntervalToDB(TransportationInterval interval);
}
