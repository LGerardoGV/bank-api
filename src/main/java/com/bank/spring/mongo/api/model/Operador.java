package com.bank.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="operadores")
public class Operador extends Usuario {
	int numEmpleado;
	String roles;
	
	public Operador(String id, String nombre, String apePaterno, String apeMaterno, String domicilio, String rfc,
			String actEconomica, int edad, String sexo, String sueldoMensual, String curp, boolean status, int numEmpleado, String roles) {
		super(id, nombre, apePaterno, apeMaterno, domicilio, rfc, actEconomica, edad, sexo, sueldoMensual, curp, status);
		this.numEmpleado = numEmpleado;
		this.roles = roles;
		
	}
	
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
}
