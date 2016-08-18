package com.example.repo;

import com.example.entity.TransportationSearchResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by dima on 17.08.16.
 */

@Repository
@Transactional
public interface TransportationRepository extends CrudRepository<TransportationSearchResult, Integer>{
}
