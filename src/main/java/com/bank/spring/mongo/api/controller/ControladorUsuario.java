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

import com.bank.spring.mongo.api.model.Usuario;
import com.bank.spring.mongo.api.respository.RepositorioUsuario;

@RestController
public class ControladorUsuario {
	@Autowired
	private RepositorioUsuario repository;
	
	@PostMapping("/addUser")
	public String saveUsuario(@RequestBody Usuario usuario) {
		repository.save(usuario);
		return "Se agrego usuario con id: "+usuario.getId();
	}
	
	@GetMapping("/allUsers")
	public List<Usuario> getUsuarios(){
		return repository.findAll();
	}
	
	@GetMapping("/allUsers/{id}")
	public Optional<Usuario> getUsuario(@PathVariable String id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUsuario(@PathVariable String id) {
		repository.deleteById(id);
		return "Usuario eliminado con id: "+id;
	}
}
