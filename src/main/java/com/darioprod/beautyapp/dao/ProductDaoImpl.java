package com.darioprod.beautyapp.dao;

import org.springframework.stereotype.Repository;

import com.darioprod.beautyapp.model.Product;

@Repository
public class ProductDaoImpl extends AbstractDao<Product, Long> implements ProductDao{

}
