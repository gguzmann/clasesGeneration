package com.generation.may27;

public class Alumno {

	// Atributo
	private String nombre;
	private String apellido;
	private int edad;
	private String curso;

	// Constructor
	public Alumno() {
	
	}

	public Alumno(String nombre, String apellido, Integer edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}

	// Getter Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}

	// Metodos

	
	
}
