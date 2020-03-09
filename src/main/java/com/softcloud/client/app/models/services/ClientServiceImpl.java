package com.softcloud.client.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softcloud.client.app.models.dao.IClientDao;
import com.softcloud.client.app.models.entity.Client;

@Service
public class ClientServiceImpl implements IClientService{
	
	@Autowired
	private IClientDao clientDao;

	@Override
	@Transactional(readOnly = true)
	public List<Client> findAll() {
		
		return (List<Client>) clientDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Client findById(Long id) {
		return clientDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Client save(Client client) {
		return clientDao.save(client);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clientDao.deleteById(id);
		
	}

}
