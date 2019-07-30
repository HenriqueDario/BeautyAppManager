package com.darioprod.beautyapp.dao;

import java.util.List;

import com.darioprod.beautyapp.model.Position;

public interface PositionDao {
	
	void save(Position position);
	
	void update(Position position) ;
	
	void delete(Long id);
	
	Position findById(Long id);
	
	List<Position> findAll();
}
