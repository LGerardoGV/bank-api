package com.bank.spring.mongo.api.repository;

import java.util.List;
import java.util.Optional;

//import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.spring.mongo.api.model.Operador;
@Repository
public interface RepositorioOperador extends MongoRepository<Operador, Integer> {
	public List<Operador> findByEmplooyeNumber(int numEmpleado);
	//public Optional<Operador> findByEmployeeNumber(int numEmpleado);
	//public Optional <Operador> findByRFC(String rfc);
}
