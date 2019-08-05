package com.darioprod.beautyapp.service;

import java.util.List;

import com.darioprod.beautyapp.model.Reason;

public interface ReasonService {
	void save(Reason reason);

	void update(Reason reason) ;

	void delete(Long id);

	Reason findById(Long id);

	List<Reason> findAll();
}


