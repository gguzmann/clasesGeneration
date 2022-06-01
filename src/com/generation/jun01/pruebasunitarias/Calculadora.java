package com.generation.jun01.pruebasunitarias;

public class Calculadora {
	// Suma, resta, multiplicacion, division
	
	public int suma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public int resta(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public int mult(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	public String division(int numero1, int numero2) {
		if(numero2 != 0) {
			return Integer.toString(numero1 / numero2);
		}
		return "No se puede dividir por 0";
	}
}
