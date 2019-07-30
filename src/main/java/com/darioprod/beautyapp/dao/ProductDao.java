package com.darioprod.beautyapp.dao;

import java.util.List;

import com.darioprod.beautyapp.model.Product;

public interface ProductDao {
	
	void save(Product product);

	void update(Product product) ;

	void delete(Long id);

	Product findById(Long id);

	List<Product> findAll();
}
