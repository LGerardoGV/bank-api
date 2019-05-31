package com.bank.spring.mongo.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.spring.mongo.api.model.Operador;
import com.bank.spring.mongo.api.repository.RepositorioOperador;

@RestController
public class ControladorOperador {
	@Autowired
	private RepositorioOperador repository;
	
	//Crear operador
	@PostMapping("/users/operator")
	public String saveOperador(@RequestBody Operador operador) {
		repository.save(operador);
		return "Creación exitosa de "+ operador.getNombre() + " con id " + operador.getId();
	}

	//Buscar operador por id
	/*@GetMapping("/users/operator/{id}")
	public Optional<Operador> getOperadorById(@PathVariable String id){
		return repository.findById(id);
	}*/
	
	//Buscar operador por número de empleado
	@GetMapping("/users/operator/{numEmpleado}")
	public List<Operador> getOperadorByEmployeeNumber(@PathVariable int numEmpleado){
		return repository.findByEmplooyeNumber(numEmpleado);
	}
	
	//Buscar operador por rfc
	/*@GetMapping("/users/operator/{rfc}")
	public Optional<Operador> getOperadorByRfc(@PathVariable String rfc){
		return repository.findByRFC(rfc);
	}*/
	
	//Buscar operador por nombre
	/*@GetMapping("/users/operator/{nombre}")
	public Optional<Operador> getOperadorByRfc(@PathVariable String nombre){
		return repository.findByName(nombre);
	}*/
	
	//Modificar de datos
	@PostMapping("/users/operator/{id}")
	public String updateOperador(@RequestBody Operador op) {
		repository.save(op);
		return "Modificación exitosa ";
	}
	
	//Borrado lógico
	/*@PostMapping("/users/operator/{id}")
	public String softDelete(@RequestBody Operador op) {
		op.setStatus(true);
		return "Borrado lógico correcto";
	}*/
	
}
