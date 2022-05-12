package com.demo.MyFleetApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MyFleetApp.models.Client;
import com.demo.MyFleetApp.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	//Return list of clients
	public List<Client> getClients(){
		return clientRepository.findAll();
	}

	//Save new client
	public void save(Client client) {
		clientRepository.save(client);
	}

	//Get by id
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}

	//Delete by id
	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}

}
