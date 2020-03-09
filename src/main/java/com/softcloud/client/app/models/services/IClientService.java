package com.softcloud.client.app.models.services;

import java.util.List;

import com.softcloud.client.app.models.entity.Client;

public interface IClientService {
	
	public List<Client> findAll();

}
