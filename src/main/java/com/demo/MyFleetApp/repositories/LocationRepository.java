package com.demo.MyFleetApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.MyFleetApp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
