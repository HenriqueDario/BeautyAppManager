package com.darioprod.beautyapp.dao;

import java.util.List;

import com.darioprod.beautyapp.model.Reason;

public interface ReasonDao {
	
	void save(Reason reason);

	void update(Reason reason) ;

	void delete(Long id);

	Reason findById(Long id);

	List<Reason> findAll();
}
