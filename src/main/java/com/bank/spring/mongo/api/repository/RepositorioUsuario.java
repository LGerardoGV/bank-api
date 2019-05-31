package com.bank.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bank.spring.mongo.api.model.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario, String>	{

}
