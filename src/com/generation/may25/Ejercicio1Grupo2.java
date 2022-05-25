package com.generation.may25;

import java.util.Scanner;

public class Ejercicio1Grupo2 {

	public static void main(String[] args) {

		// Pedir dato de venta
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su monto de venta");
		int venta = sc.nextInt();

		// Variables a utilizar
		int comision30 = 30;
		int comision20 = 20;
		int comision10 = 10;
		int formula = 0;

		// COMPRARACION DE DATOS INGRESADOS
		// VALOR DE COMISION MENOR A 1000 EN VENTA
		if (venta <= 1000) {
			System.out.println("No aplica comision");

			// VALOR DE COMISION MAYOR A 1001 Y MENOR A 4999 EN VENTA
		} else if (venta >= 1001 && venta <= 4999) {
			formula = (venta * comision10) / 100;
			System.out.println("La comision para esta venta es: " + formula);

			// VALOR DE COMISION MAYOR A 5001 Y MENOR A 9999 EN VENTA
		} else if (venta >= 5001 && venta <= 9999) {
			formula = (venta * comision20) / 100;
			System.out.println("La comision para esta venta es: " + formula);

			// VALOR DE COMISION MAYOR A 10000 EN VENTA
		} else if (venta >= 10000) {
			formula = (venta * comision30) / 100;
			System.out.println("La comision para esta venta es: " + formula);

			// VALOR DE COMISION IGUAL A 5000 EN VENTA
		} else if (venta == 5000);
		System.out.println("No aplica comision");
		}
	}
