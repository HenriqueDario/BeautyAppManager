package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.ServiceDao;

@Service @Transactional
public class ServiceServiceImpl implements ServiceService{
	
	@Autowired
	private ServiceDao dao;

	@Override
	public void save(com.darioprod.beautyapp.model.Service service) {
		dao.save(service);
	}

	@Override
	public void update(com.darioprod.beautyapp.model.Service service) {
		dao.update(service);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public com.darioprod.beautyapp.model.Service findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<com.darioprod.beautyapp.model.Service> findAll() {		
		return dao.findAll();
	}

}
