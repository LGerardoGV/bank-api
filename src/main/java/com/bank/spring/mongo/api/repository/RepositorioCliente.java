package com.bank.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bank.spring.mongo.api.model.Cliente;

public interface RepositorioCliente extends MongoRepository<Cliente, String>{
	
}
