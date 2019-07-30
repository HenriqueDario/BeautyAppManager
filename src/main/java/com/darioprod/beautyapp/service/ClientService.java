package com.darioprod.beautyapp.service;

import java.util.List;

import com.darioprod.beautyapp.model.Client;

public interface ClientService {
	
	void save(Client client);

	void update(Client client) ;

	void delete(Long id);

	Client findById(Long id);

	List<Client> findAll();

	boolean clientHaveScheduling(Long id);

	List<Client> findByName(String name);
}
