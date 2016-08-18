package com.example.transformer;

import com.example.entity.TransportationSearchResult;
import com.example.r2rPojos.SearchRouteResponse;

import java.util.List;

/**
 * Created by dima on 17.08.16.
 */
public interface R2RTransformer {
    List<TransportationSearchResult> transform(SearchRouteResponse response);
}
