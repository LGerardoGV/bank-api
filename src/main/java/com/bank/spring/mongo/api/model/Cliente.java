package com.bank.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cliente extends Usuario {
	public Cliente(String idUsuario, String nombre, String apePaterno, String apeMaterno, String domicilio, String rfc,
			String actEconomica, int edad, String sexo, String sueldoMensual, String curp, boolean status) {
		super(idUsuario, nombre, apePaterno, apeMaterno, domicilio, rfc, actEconomica, edad, sexo, sueldoMensual, curp, status);
	}
}
