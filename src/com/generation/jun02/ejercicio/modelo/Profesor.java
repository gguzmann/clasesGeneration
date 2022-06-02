package com.generation.jun02.ejercicio.modelo;

import java.util.List;

public class Profesor extends Trabajador{
	String materia;
	int curso;
	String letraCurso;

	// CONSTRUCTOR VACIO
	public Profesor() {
		super();
	}

//CONSTRUCTOR CON PARAMETRO
	public Profesor(String materia, int curso, String letraCurso) {
		super();
		this.materia = materia;
		this.curso = curso;
		this.letraCurso = letraCurso;
	}

	// GETTERS AND SETTERS

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getLetraCurso() {
		return letraCurso;
	}

	public void setLetraCurso(String letraCurso) {
		this.letraCurso = letraCurso;
	}

	// CONSTRUCTOR TOSTRING
	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", curso=" + curso + ", letraCurso=" + letraCurso + "]";
	}


	public void Asistencia(List<String> alumnos) {
		for (String alumno : alumnos) {//recorrer elemento lista alumnos
			System.out.println(alumno + " " + "Presente");
		}
	}

}
