package com.demo.MyFleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.MyFleetApp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
