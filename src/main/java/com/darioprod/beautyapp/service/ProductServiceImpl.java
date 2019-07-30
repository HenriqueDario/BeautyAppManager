package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.ProductDao;
import com.darioprod.beautyapp.model.Product;

@Service @Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;
	
	@Override
	public void save(Product product) {
		dao.save(product);
	}

	@Override
	public void update(Product product) {
		dao.update(product);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Product findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Product> findAll() {
		return dao.findAll();
	}

}
