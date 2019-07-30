package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.ItemDao;
import com.darioprod.beautyapp.model.Item;

@Service @Transactional
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDao dao;

	@Override
	public void save(Item item) {
		dao.save(item);
	}

	@Override
	public void update(Item item) {
		dao.update(item);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Item findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Item> findAll() {
		return dao.findAll();
	}
}
