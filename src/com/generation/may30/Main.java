package com.generation.may30;

import java.util.ArrayList;
import java.util.List;

import com.generation.may27.Alumno;
import com.generation.may31.Cliente;

public class Main {
	// Interfaces -> Solo definen los metodos
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Interfaz
		List<Alumno> grupo2 = new ArrayList<Alumno>();
		
		// Instancia
		Alumno gene = new Alumno("Genesis", "Quezada", 27, "G1");
		Alumno gabo = new Alumno("Gabriel", "Guzman", 29, "G1");
		Alumno cata = new Alumno("Catalina", "Castillo", 26, "G1");
		Alumno carlos = new Alumno("Carlos", "Iturra", 26, "G1");
		Alumno nico = new Alumno("Nicolas", "Neira", 27, "G1");

		grupo2.add(gene);
		grupo2.add(gabo);
		grupo2.add(cata);
		grupo2.add(carlos);
		grupo2.add(nico);
		
		System.out.println(grupo2.toString());
		
		for (Alumno alumno2 : grupo2) {
			System.out.println(alumno2);
		}
		
		for (int i = 0; i < grupo2.size(); i++) {
			System.out.println(grupo2.get(i).getNombre());
		}
		
		/*
		System.out.println("*********************************");
		System.out.println("Nombre completo: " + gene.getNombre() + " " + gene.getApellido() + " Edad: "
				+ gene.getEdad() + " curso " + gene.getCurso());
		System.out.println("Nombre completo: " + gabo.getNombre() + " " + gabo.getApellido() + " Edad: "
				+ gabo.getEdad() + " Curso: " + gabo.getCurso());// get para obtener el atributo que tiene asignado mi
																	// variable
		System.out.println("nombre completo: " + cata.getNombre() + " " + cata.getApellido() + " Edad: "
				+ cata.getEdad() + " Curso: " + cata.getCurso());
		System.out.println("Nombre completo: " + carlos.getNombre() + " " + carlos.getApellido() + " Edad: "
				+ carlos.getEdad() + " Curso: " + carlos.getCurso());
		System.out.println("Nombre completo: " + nico.getNombre() + " " + nico.getApellido() + " Edad: "
				+ nico.getEdad() + " Curso: " + nico.getCurso());
		System.out.println("*********************************");
		

		System.out.println("*********************************");
		printNames(gene);
		printNames(gabo);
		printNames(cata);
		printNames(carlos);
		printNames(nico);
		System.out.println("*********************************");
		System.out.println(gene.toString());
		System.out.println(gabo.toString());
		System.out.println(carlos.toString());
		System.out.println(cata.toString());
		System.out.println(nico.toString());
		*/
		

		Cliente cliente = new Cliente();
		
		
		
	}
	
	public static void printNames(Alumno alumno)
	{
		System.out.println("Nombre completo: " + alumno.getNombre() + " " + alumno.getApellido() + " Edad: "
				+ alumno.getEdad() + " curso " + alumno.getCurso());
	}

}
