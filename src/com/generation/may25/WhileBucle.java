package com.generation.may25;

import java.util.Scanner;

public class WhileBucle {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	

		int termino = 0;
		while(termino <= 10){
			System.out.println(termino);
			termino++;
		}
		
		
		
		int option;
		
		do {
			System.out.println("Ingrese una opcion");
			System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
			option = sc.nextInt();
		} while (option < 0 || option > 4);
		
		/*System.out.println("Ingrese una opcion");
		System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
		int opcion = sc.nextInt();
		
		while (opcion < 0 || opcion > 4) {

			System.out.println("Ingrese una opcion");
			System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
			opcion = sc.nextInt();
		}
		*/
		
		switch (option) {
		case 1:
			System.out.println("sumar");
			break;

		case 2:
			System.out.println("restar");
			break;
			
		case 3:
			System.out.println("multiplicar");
			break;
			
		case 4:
			System.out.println("dividir");
			break;
			
		default:
			System.out.println("Opcion invalida");
			break;
		}
	}
}