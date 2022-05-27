package com.generation.may27;

public class Auto {
	// Una clase es un modelo o prototipo con atributos y methodos
	// Objeto -> Es la instancia de una clase.

	// Atributos
	// Accese - Tipo - Nombre - Valor
	private String color;
	private String marca;
	private String modelo;
	private Double speed;

	// Constructor

	public Auto(String color, String marca, String modelo, Double speed) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.speed = speed;
	}

	// Accesadores y Mutadores(get y set)

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	// Metodos - Funciones
	public void aumentarVelocidad() {
		this.speed = 10d;
	}
}
