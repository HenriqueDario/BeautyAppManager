package com.darioprod.beautyapp.dao;

import java.util.List;

import com.darioprod.beautyapp.model.Scheduling;

public interface SchedulingDao {
	
	void save(Scheduling scheduling);

	void update(Scheduling scheduling) ;

	void delete(Long id);

	Scheduling findById(Long id);

	List<Scheduling> findAll();
}
