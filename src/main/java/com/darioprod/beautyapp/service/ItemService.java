package com.darioprod.beautyapp.service;

import java.util.List;

import com.darioprod.beautyapp.model.Item;

public interface ItemService {
	void save(Item item);

	void update(Item item) ;

	void delete(Long id);

	Item findById(Long id);

	List<Item> findAll();
}
