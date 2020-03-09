package com.softcloud.client.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.softcloud.client.app.models.entity.Client;

public interface IClientDao  extends CrudRepository<Client, Long>{ 

}
