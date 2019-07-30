package com.darioprod.beautyapp.dao;

import java.util.List;

import com.darioprod.beautyapp.model.Service;

public interface ServiceDao {
	
	void save(Service service);

	void update(Service service) ;

	void delete(Long id);

	Service findById(Long id);

	List<Service> findAll();
}
