package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.ReasonDao;
import com.darioprod.beautyapp.model.Reason;

@Service @Transactional
public class ReasonServiceImpl implements ReasonService {

	@Autowired
	private ReasonDao dao;
	
	
	@Override
	public void save(Reason reason) {
		dao.save(reason);
	}

	@Override
	public void update(Reason reason) {
		dao.update(reason);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Reason findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Reason> findAll() {
		return dao.findAll();
	}

}
