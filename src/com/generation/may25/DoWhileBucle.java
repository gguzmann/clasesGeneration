package com.generation.may25;

import java.util.Scanner;

public class DoWhileBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int termino = 0;

		do {
			System.out.println("Valor termino: " + termino);
			termino++;
		} while (termino <= 10);

		int option;
		do {
			System.out.println("Ingrese una opcion");
			System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
			option = sc.nextInt();
		} while (option < 0 || option > 4);
	}

}
