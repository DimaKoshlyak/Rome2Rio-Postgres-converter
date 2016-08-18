package com.example.service;

import com.example.entity.TransportationInterval;
import com.example.entity.TransportationSearchResult;
import com.example.repo.IntervalsRepository;
import com.example.repo.TransportationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dima on 17.08.16.
 */

@Service
public class TransportServiceImpl implements TransportService{

    @Autowired
    private TransportationRepository transportationRepository;

    @Autowired
    private IntervalsRepository intervalsRepository;

    @Override
    public void saveSearchResultToDB(TransportationSearchResult result){
        transportationRepository.save(result);
    }

    @Override
    public void saveIntervalToDB(TransportationInterval interval){
        intervalsRepository.save(interval);
    }
}
