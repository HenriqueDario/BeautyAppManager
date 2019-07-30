package com.darioprod.beautyapp.dao;

import org.springframework.stereotype.Repository;

import com.darioprod.beautyapp.model.Item;

@Repository
public class ItemDaoImpl extends AbstractDao<Item, Long> implements ItemDao {

}
