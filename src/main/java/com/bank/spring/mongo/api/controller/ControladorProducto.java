package com.bank.spring.mongo.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.spring.mongo.api.model.Producto;
import com.bank.spring.mongo.api.repository.RepositorioProducto;

@RestController
public class ControladorProducto {
	@Autowired
	private RepositorioProducto repository;
	
	//Crear producto
	@PostMapping("/products")
	public String saveProduct(@RequestBody Producto producto) {
		repository.save(producto);
		return "Creación exitosa de "+ producto.getNombre() + " con id " + producto.getId();
	}
	
	//Buscar producto por id
	@GetMapping("/products/{id}")
	public Optional<Producto> getProductoById(@PathVariable String id){
		return repository.findById(id);
	}
	
	//Buscar producto por fecha de creación
	@GetMapping("/products/{fechaCreacion}")
	public Optional<Producto> getProductoByFechaCreacion(@PathVariable String fechaCreacion){
		return repository.findByFechaCreacion(fechaCreacion);
	}
	
	//Modificar datos
	@PostMapping("/products/{id}")
	public String updateProducto(@RequestBody Producto prod) {
		repository.save(prod);
		return "Modificación exitosa";
	}
	
	
	
}
