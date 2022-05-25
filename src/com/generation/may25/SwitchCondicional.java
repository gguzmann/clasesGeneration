package com.generation.may25;

import java.util.Scanner;

public class SwitchCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una opcion");
		System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
		int opcion = sc.nextInt();
		
		switch (opcion) {
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
