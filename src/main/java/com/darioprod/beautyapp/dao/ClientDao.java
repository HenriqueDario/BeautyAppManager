package com.darioprod.beautyapp.dao;

import java.util.List;

import com.darioprod.beautyapp.model.Client;

public interface ClientDao {
	
	void save(Client client);
	
	void update(Client client) ;
	
	void delete(Long id);
	
	Client findById(Long id);
	
	List<Client> findAll();
	

}
