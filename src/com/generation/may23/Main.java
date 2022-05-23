package com.generation.may23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// VARIABLES
		// Hay que defenir el tipo de dato en cada variable
		// TipoDedato NombreVariable = Contenido
		String name = "Mijael";

		// 16bit (Un solo caracter)
		char letraA = 'a';
		System.out.println(letraA);

		// 8bits
		byte numeroByte = 127;
		System.out.println(numeroByte);

		// 16bits
		short numeroShort = 32767;
		System.out.println(numeroShort);

		// 32bits
		int age = 2;

		// 64bits (2^263)
		long numeroLong = 2147483647;
		System.out.println(numeroLong);

		// Existen ademas float y double(Aceptan decimales)

		// true or false
		boolean isOk = true;
		System.out.println(isOk);

		// EJERCICIOS ASIGNAR VARIABLES
		char genero = 'M';
		System.out.println(genero);

		String color = "Castaño";
		System.out.println(color);

		boolean comprometido = true;
		System.out.println(comprometido);

		int población = 16000000;
		byte edad1 = 29;
		String nombre = "Gabriel";
		String ocupación = "Cesante";
		char newGenero = 'M';

		// Scanner whriteConsola = new Scanner(System.in);
		// name = whriteConsola.nextLine();
		// System.out.println(name);

		// STRING se compara(if) con equals
		System.out.println(name.equalsIgnoreCase("mijael"));
		System.out.println("hola".toUpperCase());

		String test1 = ""; // Vacio
		System.out.println(test1.isBlank());
		String test2 = null; // null = empty

		// Comparar String con null
		if (null == test2)
			System.out.println("no existe");

		float altura1 = 1.80f;
		Float peso = 66.6f;
		Float gravedad = Float.parseFloat("9.8");

		// Parse = Convertir string a numero:
		// Integer.parseInt("23");
		// Float.parseFloat("21,2");
		// Long.parseLong("123123123");
		// Double.parseDouble("1231.123");

		// Ejercicio:

		int edad = 29;
		Long edadLong = (long) edad;
		Float edadFloat = (float) edad;
		Double edadDouble = (double) edad;
		Integer edadInt = edad;
		String edadStr = edad + "";

		System.out.println(edadLong);
		System.out.println(edadFloat);
		System.out.println(edadDouble);
		System.out.println(edadInt);
		System.out.println(edadStr);

		Float altura = 1.81f;
		Double alturaDouble2 = (double) altura;
		float alturaFloat = altura;
		// int alturaInt = altura;
		double alturDouble = altura;
		String alturaStr = altura + "";

		Double testa = 22.2;
		Float testb = testa.floatValue();

		System.out.println(alturaFloat);
		System.out.println(alturDouble);
		System.out.println(alturaStr);

		if (5 == (3 + 2)) {

		}

	}

}
