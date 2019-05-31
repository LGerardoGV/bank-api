package com.bank.spring.mongo.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection ="usuarios")
public class Usuario {
	@Id
	private String id;
	
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private String domicilio;
	private String rfc;
	private String actEconomica;
	private int edad;
	private String sexo;
	private String sueldoMensual;
	private String curp;
	private boolean status;
	
	public Usuario(String id, String nombre, String apePaterno, String apeMaterno, String domicilio, String rfc, String actEconomica, int edad, String sexo, String sueldoMensual, String curp, boolean status) {
		
		this.id = id;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.domicilio = domicilio;
		this.rfc = rfc;
		this.actEconomica = actEconomica;
		this.edad = edad;
		this.sexo = sexo;
		this.sueldoMensual = sueldoMensual;
		this.curp = curp;
		this.status = status;
		
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getActEconomica() {
		return actEconomica;
	}
	public void setActEconomica(String actEconomica) {
		this.actEconomica = actEconomica;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSueldoMensual() {
		return sueldoMensual;
	}
	public void setSueldoMensual(String sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
