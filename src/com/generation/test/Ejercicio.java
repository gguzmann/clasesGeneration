package com.generation.test;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean salida = true;
		int option;
		int nPersona = 1;
		
		while(salida){
			do {
				System.out.println("Ingrese un nuevo usuario:");
				System.out.println(" 0. Salir \n 1. Menor a 29 años \n 2. Mayor de 30 y menor de 49 \n 3. Mayor de 50 años \n 4. Mayor de 70");
				option = sc.nextInt();
				
				switch (option) {
				case 1:
					System.out.println("Persona " + nPersona + " debe 100");
					break;
				case 2:
					System.out.println("debe 200");
					break;
				case 3:
					System.out.println("debe 300");
					break;
				case 4:
					System.out.println("debe 400");
					break;
				case 0:
					System.out.println("Salir del loop.");
					salida = false;
					break;

				default:
					System.out.println("Dato invalido");
					break;
				}
				
				nPersona++;
			} while (salida);
			
		}

	}
}
