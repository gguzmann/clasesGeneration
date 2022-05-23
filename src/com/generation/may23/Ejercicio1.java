package com.generation.may23;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		//AREA TRIANGULO = (b * h) / 2
		double alturaTriangulo = 2.2;
		double baseTriangulo = 3.3;
		
		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

		System.out.println("*************");
		System.out.println("Tomando los valores de un Triangulo con altura: " + alturaTriangulo + " [m] y con una base: " + baseTriangulo + "[m]");
		System.out.println("Area Triangulo:");
		System.out.println(areaTriangulo + "[m2]");
		System.out.println("*************");
		
		
		//PERIMETRO CIRCULO = 2pi * r
		double PI = 3.14;
		double radio = 6;
		
		double perimetroCirculo = 2 * PI * radio;

		System.out.println("*************");
		System.out.println("Tomando los valores del circulo de radio: " + perimetroCirculo + "[cm]" );
		System.out.println("Perimetro Circulo:");
		System.out.println(perimetroCirculo + "[cm]");
		System.out.println("*************");
		
		ponerNota(100);
		
	}

	static void ponerNota(int nota)
	{
		
		if(nota == 101) return;
		
		if(nota >= 0 & nota < 50)
		{
			System.out.println("Desaprobo");
		}else if(nota >= 51 & nota < 101) {
			System.out.println("Aprobo");
		}else {
			System.out.println("Numero fuera de margen");
		}
	}
}




/*
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner whriteConsola = new Scanner(System.in);
		
		//AREA TRIANGULO = (b * h) / 2
		double alturaTriangulo = Double.parseDouble(whriteConsola.nextLine());
		double baseTriangulo = Double.parseDouble(whriteConsola.nextLine());
		
		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

		System.out.println("*************");
		System.out.println("Tomando los valores de un Triangulo con altura: " + alturaTriangulo + " [m] y con una base: " + baseTriangulo + "[m]");
		System.out.println("Area Triangulo:");
		System.out.println(areaTriangulo + "[m2]");
		System.out.println("*************");
		
		
		//PERIMETRO CIRCULO = 2pi * r
		double PI = 3.14;
		double radio = Double.parseDouble(whriteConsola.nextLine());
		
		double perimetroCirculo = 2 * PI * radio;

		System.out.println("*************");
		System.out.println("Tomando los valores del circulo de radio: " + radio + "[cm]" );
		System.out.println("Perimetro Circulo:");
		System.out.println(perimetroCirculo + "[cm]");
		System.out.println("*************");
	}

}
*/