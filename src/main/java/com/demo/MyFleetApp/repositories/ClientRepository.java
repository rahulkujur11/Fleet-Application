package com.demo.MyFleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.MyFleetApp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
