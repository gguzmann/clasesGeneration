package com.generation.may26;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		
		//ARRAYs no puede modificarse la longitud ni el tipo de dato pero SI el elemento.
		String[] colores = {"red", "yellow", "blue", "green"};
		Integer[] numerosPares = {2,4,6,8,10};	
		
		//Imprimir array en consola
		System.out.println(numerosPares[0]);
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		
		//Cambiar posicion 2 de arreglo colores
		colores[2] = "orange";

		System.out.println("****************");
		//Recorrer arreglo colores
		for (int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
		}
		System.out.println("****************");
		//
		for (Integer integer : numerosPares) {
			System.out.println(integer);
		}
	}

}
