package com.darioprod.beautyapp.service;

import java.util.List;

import com.darioprod.beautyapp.model.Scheduling;

public interface SchedulingService {
	void save(Scheduling scheduling);

	void update(Scheduling scheduling) ;

	void delete(Long id);

	Scheduling findById(Long id);

	List<Scheduling> findAll();
}
