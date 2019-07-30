package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.DepartmentDao;
import com.darioprod.beautyapp.model.Department;

@Service @Transactional
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentDao dao;

	@Override
	public void save(Department department) {
		dao.save(department);
	}

	@Override
	public void update(Department department) {
		dao.update(department);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Department findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Department> findAll() {
		return dao.findAll();
	}

	@Override
	public boolean departmentHavePositions(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
