package com.generation.may23;

import java.util.Iterator;

public class CalcularPromedio {

	public static void main(String[] args) {
		// Variables
		int cantidadNotas = 12;

		// Arreglo de notas
		Integer[] notas = { 2, 23, 34, 105, 75, 12, 45, 56, 22, 45, 87, 45 };

		int sumaTotal = 0;

		// Sumar notas
		for (int i = 0; i < notas.length; i++) {
			sumaTotal += notas[i];
		}

		// promedio: suma total de notas / cantidad de notas
		float promedioNotas = (float) sumaTotal / notas.length;

		if (promedioNotas >= 0 && promedioNotas < 50) {
			System.out.println("Desaprobado: " + promedioNotas);
		} else if (promedioNotas > 49 && promedioNotas <= 100) {
			System.out.println("Aprobado: " + promedioNotas);
		} else {
			System.out.println("Numero " + promedioNotas + " fuera de rango");
		}
	}

}
