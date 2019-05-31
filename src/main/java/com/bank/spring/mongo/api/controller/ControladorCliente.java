package com.bank.spring.mongo.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.spring.mongo.api.model.Cliente;
import com.bank.spring.mongo.api.repository.RepositorioCliente;

@RestController
public class ControladorCliente {
	@Autowired
	private RepositorioCliente repository;
	
	//Crear cliente
	@PostMapping("/users/client")
	public String saveCliente(@RequestBody Cliente cliente) {
		repository.save(cliente);
		return "Creación exitosa de "+ cliente.getNombre() + " con id " + cliente.getId();
	}

	//Buscar cliente por id
	@GetMapping("/users/client/{id}")
	public Optional<Cliente> getOperadorById(@PathVariable String id){
		return repository.findById(id);
	}
	
	//Buscar operador por rfc
	/*@GetMapping("/users/client/{rfc}")
	public Optional<Cliente> getOperadorByRfc(@PathVariable String rfc){
		return repository.findByRFC(rfc);
	}*/
	
	//Buscar operador por nombre
	/*@GetMapping("/users/client/{nombre}")
	public Optional<Cliente> getOperadorByRfc(@PathVariable String nombre){
		return repository.findByName(nombre);
	}*/
	
	//Actualizar datos
	@PostMapping("/users/client/{id}")
	public String updateOperador(@RequestBody Cliente cliente) {
		repository.save(cliente);
		return "Actualizacion exitosa ";
	}
	
	//Borrado lógico
	/*@PostMapping("/users/client/{id}")
	public String softDelete(@RequestBody Cliente cliente) {
		cliente.setStatus(true);
		return "Borrado lógico correcto";
	}*/
}
