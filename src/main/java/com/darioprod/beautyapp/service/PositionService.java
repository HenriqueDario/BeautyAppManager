package com.darioprod.beautyapp.service;

import java.util.List;

import com.darioprod.beautyapp.model.Position;

public interface PositionService {
	void save(Position position);

	void update(Position position) ;

	void delete(Long id);

	Position findById(Long id);

	List<Position> findAll();

	boolean positionHaveEmployees(Long id);
}
