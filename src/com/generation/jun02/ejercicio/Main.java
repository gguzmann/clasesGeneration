package com.generation.jun02.ejercicio;

import java.util.ArrayList;
import java.util.List;

import com.generation.jun02.ejercicio.modelo.Administrativos;
import com.generation.jun02.ejercicio.modelo.Profesor;
import com.generation.jun02.ejercicio.modelo.Trabajador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profe = new Profesor();
		List<String> listaAlumno = new ArrayList<>();
		// declaracion de 2 profesores y dos administrativos
		Trabajador profeIsra = new Trabajador();
		Profesor profePame = new Profesor();
		Trabajador madga = new Administrativos();
		Administrativos Andrea = new Administrativos();

		// declaracion de lista de trabajadores
		List<Trabajador> generation = new ArrayList<Trabajador>();

		// datos profeIsra
		profeIsra.setNombre("Isra");
		profeIsra.setArea("clases");
		profeIsra.setHorasLaborales(45);

		// datos profe Pame
		profePame.setCurso(1);
		profePame.setLetraCurso("G");
		profePame.setNombre("Pame");
		profePame.setHorasLaborales(45);
		profePame.setArea("clases");

		// datos magda
		madga.setNombre("magda");

		// datos Andrea
		Andrea.setNombre("Andrea");

		generation.add(Andrea);
		generation.add(madga);
		generation.add(profePame);
		generation.add(profeIsra);

		listaAlumno.add("Juan");
		listaAlumno.add("Pepe");
		listaAlumno.add("Pedro");

		profe.Asistencia(listaAlumno);
	}

}