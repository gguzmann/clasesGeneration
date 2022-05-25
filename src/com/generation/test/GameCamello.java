package com.generation.test;

import java.util.Scanner;

public class GameCamello {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Introduccion
		System.out.println("Bienvenido al Camello!");
		System.out.println("Has robado un camello para atravesar el gran desierto del Mobi.");
		System.out
				.println("Los nativos quieren que les devuelvas su camello y salen en persecución tuya! Tendrás que ");
		System.out.println("sobrevivir al desierto y correr más que los nativos.");

		// Variables
		boolean gameLoop = true;
		int millas = 0;
		int sed = 0;
		int cansancio = 0;
		int distanciaNativos = -20;
		int cantimploras = 3;

		// Comienzo de loop
		while (gameLoop) {
			System.out.println("1. Beber de la cantimplora.");
			System.out.println("2. Velocidad moderada hacia adelante.");
			System.out.println("3. A toda velocidad hacia adelante.");
			System.out.println("4. Para y descansa.");
			System.out.println("5. Comprueba tu estado.");
			System.out.println("6. Salir.");
			System.out.println("");
			System.out.println("¿Qué eliges?");
			int opcion = sc.nextInt();

			// Opciones
			if (opcion == 6) {
				gameLoop = false;
			} else if (opcion == 5) {
				System.out.println("");
				System.out.println("Millas recorridas: " + millas);
				System.out.println("Cantimploras: " + cantimploras);
				System.out.println("Los nativos están a " + distanciaNativos + " millas detrás de ti.");
				System.out.println("");
			} else if (opcion == 4) {
				cansancio = 0;
				distanciaNativos += 10;
				System.out.println("");
				System.out.println("Has pasado la noche para descansar, tu camello te lo agradece");
				System.out.println("");
			} else if (opcion == 3) {
				millas += 12;
				sed += 1;
				cansancio += 3;
				distanciaNativos += 10;

				System.out.println("");
				System.out.println("Haz recorrido 12 millas.");
				System.out.println("");
			} else if (opcion == 2) {
				millas += 8;
				sed += 1;
				cansancio += 1;
				distanciaNativos += 10;

				System.out.println("");
				System.out.println("Haz recorrido 8 millas.");
				System.out.println("");
			} else if (opcion == 1) {
				if (cantimploras > 0) {
					cantimploras -= 1;
					sed = 0;
				} else {
					System.out.println("No te quedan cantimploras para beber.");
				}
			}

			// Comprobaciones si continua o no el Loop

			// SED
			if (sed > 5) {
				System.out.println("Haz muerto de sed");
				gameLoop = false;
			} else if (sed > 3 && sed < 5) {
				System.out.println("Estas sediento.");
			}

			// CANSANCIO
			if (cansancio > 8) {
				System.out.println("Tu camello a muerto.");
				gameLoop = false;
			} else if (cansancio > 5 && cansancio < 8) {
				System.out.println("Tu camello esta cansado.");
			}

			// DISTANCIA > 0: LOSS
			if (distanciaNativos > 0) {
				System.out.println("Los nativos te han capturado.");
				gameLoop = false;
			} else if (distanciaNativos > -15 && distanciaNativos < 0) {
				System.out.println("Los nativos estan cerca.");
			}

			// MILLAS RECORRIDAS: 200 WIN
			if (millas > 200) {
				System.out.println("Haz ganado!");
				gameLoop = false;
			}

		}

	}

}
