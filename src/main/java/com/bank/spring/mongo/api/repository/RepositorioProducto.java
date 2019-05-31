package com.bank.spring.mongo.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bank.spring.mongo.api.model.Producto;

public interface RepositorioProducto extends MongoRepository<Producto, String>{

	Optional<Producto> findByFechaCreacion(String fechaCreacion);

}
