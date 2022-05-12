package com.demo.MyFleetApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MyFleetApp.models.Country;
import com.demo.MyFleetApp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//Get All Countries
	public List<Country> getCountries(){

		return countryRepository.findAll();
	}

	//Update Country
	public void save( Country country) {
		countryRepository.save(country);
	}

	//Delete Country
	public void delete(int id) {
		countryRepository.deleteById(id);
	}

	//Get Country By Id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

}
