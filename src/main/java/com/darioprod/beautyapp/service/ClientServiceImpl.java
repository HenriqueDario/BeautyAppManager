package com.darioprod.beautyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darioprod.beautyapp.dao.ClientDao;
import com.darioprod.beautyapp.model.Client;

@Service @Transactional
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientDao dao;

	@Override
	public void save(Client client) {
		dao.save(client);
	}

	@Override
	public void update(Client client) {
		dao.update(client);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Client findById(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Client> findAll() {
		return dao.findAll();
	}

	@Override
	public boolean clientHaveScheduling(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override @Transactional(readOnly = true)
	public List<Client> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
