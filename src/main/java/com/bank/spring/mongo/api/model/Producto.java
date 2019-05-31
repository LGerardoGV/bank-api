package com.bank.spring.mongo.api.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "productos")
public class Producto {
	@Id
	String id;
	String nombre;
	String descripcion;
	LocalDate fechaCreacion;
	boolean status;
	LocalDate fechaExpiracion;
	LocalDate fechaVigor;
	String caracteristicas;
	
	public Producto(String id, String nombre, String descripcion, LocalDate fechaCreacion, LocalDate fechaVigor, String caracteristicas) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
		this.fechaVigor = fechaVigor;
		this.caracteristicas = caracteristicas;
	}
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDate getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(LocalDate fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public LocalDate getFechaVigor() {
		return fechaVigor;
	}

	public void setFechaVigor(LocalDate fechaVigor) {
		this.fechaVigor = fechaVigor;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	
}
