package com.bank.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bank.spring.mongo.api.model.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario, String>	{

}
