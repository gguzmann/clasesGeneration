package com.generation.may26;

public class TestMath {

	public static void main(String[] args) {
		// MATH

		// POTENCIA - ELEVADO
		double numPotencia = Math.pow(3.4999999999999999999, 1);
		System.out.println(numPotencia);

		// Redondear entero mayor
		double enteroMayor = Math.ceil(numPotencia);
		// Redondear entero menor
		double enteroMenor = Math.floor(numPotencia);
		// Rendondear mas cercano
		double enteroRedondeado = Math.round(numPotencia);

		System.out.println(enteroMayor);
		System.out.println(enteroMenor);
		System.out.println(enteroRedondeado);

		// Numeros aleatorios
		double random = Math.random();
		System.out.println(random);

		// Numero aleatorio entre 0 y 10
		double numRandom = Math.random() * 10;
		System.out.println(Math.round(numRandom));

		// Num aleatorio 2 y 8
		double random28 = (Math.random() * 8) + 2;
		System.out.println(random28);

		// num aleatorio entre dos numeros
		for (int i = 0; i < 100; i++) {

			double newRandom = Math.random() * (4 - -4) + -4;
			System.out.println(Math.floor(newRandom));
		}
	}

}
