package com.generation.Grupo2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un numero1");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese un numero2");
		int numero2 = sc.nextInt();

		suma(numero1, numero2);
		resta(numero1, numero2);
		multiplicacion(numero1, numero2);
		division(numero1, numero2);
		resto(numero1, numero2);
	}

	public static Integer multiplicacion(int num1, int num2) {
		//
		int producto = num1 * num2;

		return producto;
	}

	public static double division(double num1, double num2) {
		// num1 es el dividendo
		// num2 es divisor

		if (num2 != 0) {
			return num1 / num2;

		} else {
			return 22;
		}
	}

	public static Integer resta(int num1, int num2) {

		int resultadoResta = num1 - num2;

		return resultadoResta;
	}

	public static void resto(int num1, int num2) {
		if (num1 % 2 == 0) {
			System.out.println("Numero1 es par");
		} else {
			System.out.println("Numero1 es impar");
		}

		if (num2 % 2 == 0) {
			System.out.println("Numero2 es par");
		} else {
			System.out.println("Numero2 es impar");
		}
	}

	public static Integer suma(int num1, int num2) {
		int resultadoSuma = num1 - num2;
		return resultadoSuma;

	}

}
