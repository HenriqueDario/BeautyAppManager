package com.darioprod.beautyapp.dao;

import java.util.List;

import com.darioprod.beautyapp.model.Item;

public interface ItemDao {
	void save(Item item);

	void update(Item item) ;

	void delete(Long id);

	Item findById(Long id);

	List<Item> findAll();
}
