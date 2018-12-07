package org.upgrad.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.upgrad.models.States;

import java.util.List;

// This repository interface is responsible for the interaction between the StatesService with the states database

@Repository
public interface StateRepository extends CrudRepository<States, Integer>{

    @Query(nativeQuery = true, value="SELECT * FROM STATES")
    List<States> getAllStates();
}
