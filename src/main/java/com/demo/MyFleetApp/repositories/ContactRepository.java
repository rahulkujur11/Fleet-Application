package com.demo.MyFleetApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.MyFleetApp.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
