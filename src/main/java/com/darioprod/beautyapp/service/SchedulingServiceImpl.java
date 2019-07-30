package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.SchedulingDao;
import com.darioprod.beautyapp.model.Scheduling;

@Service
public class SchedulingServiceImpl implements SchedulingService{

	@Autowired
	private SchedulingDao dao;
	
	@Override
	public void save(Scheduling scheduling) {
		dao.save(scheduling);
	}

	@Override
	public void update(Scheduling scheduling) {
		dao.update(scheduling);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Scheduling findById(Long id) {		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Scheduling> findAll() {		
		return dao.findAll();
	}

}
