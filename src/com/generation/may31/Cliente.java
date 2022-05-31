package com.generation.may31;

import java.util.List;

public class Cliente {

	private String rut;
	private Integer id;
	private List<Integer> numeroVenta;
	private String nombre;
	private String correo;
	
	//Constructor
	public Cliente() {
		super();
	}

	public Cliente(String rut, Integer id, List<Integer> numeroVenta, String nombre, String correo) {
		super();
		this.rut = rut;
		this.id = id;
		this.numeroVenta = numeroVenta;
		this.nombre = nombre;
		this.correo = correo;
	}
	
	//GETTER & SETTER

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Integer> getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(List<Integer> numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", id=" + id + ", numeroVenta=" + numeroVenta + ", nombre=" + nombre
				+ ", correo=" + correo + "]";
	}
	
	
	
}
