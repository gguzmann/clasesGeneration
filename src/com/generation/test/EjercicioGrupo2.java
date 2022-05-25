package com.generation.test;

import java.util.Scanner;

public class EjercicioGrupo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Inicializar Variables
		int inferior = 0;
		int superior = 0;
		int datoIngresado = 0;
		int sumaDentroRango = 0;
		int contadorFueraRango = 0;
		int contadorIgualLimites = 0;

		// ingreso de tango de datos
		do {
			System.out.println("Ingrese un numero para el limite inferior");
			inferior = sc.nextInt();
			System.out.println("Ingre un numero mayor para el limite superior");
			superior = sc.nextInt();

			if (superior < inferior) {
				System.out.println("Limite inferior mayor al superior. Ingrese numeros validos");
			}

		} while (superior < inferior);// condicion de quiebre

		// Introducir numeros. 0 Detiene el while.

		System.out.println("a continuacion, ingrese numeros a gusto, para terminar ingrese un 0");
		do {

			System.out.println("Ingrese un numero.");
			datoIngresado = sc.nextInt();

			// condicion de salida, sin considerar 0 en los contadores
			if (datoIngresado != 0) {
				// comprobacion fuera o dentro del rango
				if (datoIngresado < inferior || datoIngresado > superior) {
					contadorFueraRango++;
				} else {
					sumaDentroRango += datoIngresado;
				}

				// Comprobar si numero es igual a limite superior o inferior
				if (datoIngresado == inferior || datoIngresado == superior) {
					contadorIgualLimites++;
				}
			}
		} while (datoIngresado != 0);

		// Imprimir resultados
		System.out.println("Sumas de numero ingresados dentro del rango: " + sumaDentroRango);
		System.out.println("Numero fuera de rango: " + contadorFueraRango);
		System.out.println("Numero igual a limite inferior o superior: " + contadorIgualLimites);

	}

}
