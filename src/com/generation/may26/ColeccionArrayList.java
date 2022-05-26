package com.generation.may26;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();

		// Agregar elemento al final de la lista
		colores.add("red");
		colores.add("blue");

		// Si se indica el indice ingresa un elemento y desplaza el que estaba
		colores.add(1, "yellow");
		colores.add(colores.size(), "yellow");
		System.out.println(colores);

		// remove elemento y se modifica el tamaño
		System.out.println(colores.remove(0));
		System.out.println(colores);

		// tamaño de array
		System.out.println(colores.size());

		// Modificar elemento
		colores.set(2, "black");
		System.out.println(colores);

		// Recorrer list
		for (int i = 0; i < colores.size() - 1; i++) {
			System.out.println(colores.get(i));
		}
		
		for (String color : colores) {
			System.out.println(color + " foreach");
		}
		//Ordenar arreglo ascendentemente -> Modifica el arreglo
		Collections.sort(colores);
		System.out.println(colores);
		
		// Quitar todos los elementos
		colores.clear();
		System.out.println(colores);

		numerosPares.add(10);
		numerosPares.add(8);
		numerosPares.add(24);
		numerosPares.add(2);
		numerosPares.add(18);
		
		System.out.println(numerosPares);
		
		Collections.sort(numerosPares);
		System.out.println(numerosPares);
		
		//Ordena el array al revez (no de forma descendente)
		Collections.reverse(numerosPares);
		System.out.println(numerosPares);
	}

}
