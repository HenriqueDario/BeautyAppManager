package com.darioprod.beautyapp.service;

import java.util.List;

import com.darioprod.beautyapp.model.Product;

public interface ProductService {
	void save(Product product);

	void update(Product product) ;

	void delete(Long id);

	Product findById(Long id);

	List<Product> findAll();
}
