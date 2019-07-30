package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.PositionDao;
import com.darioprod.beautyapp.model.Position;

@Service @Transactional
public class PositionServiceImpl implements PositionService{

	@Autowired
	private PositionDao dao;
	
	@Override
	public void save(Position position) {
		dao.save(position);
	}

	@Override
	public void update(Position position) {
		dao.update(position);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Position findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Position> findAll() {
		return dao.findAll();
	}

	@Override @Transactional(readOnly = true)
	public boolean positionHaveEmployees(Long id) {
		if(findById(id).getEmployees().isEmpty()) {
			return false;
		}
		return true;
	}

}
