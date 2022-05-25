package com.generation.test;

import java.util.Random;
import java.util.Scanner;

public class EjercicioCasoCasino {
	public static void main(String[] args) { /*
												 * Solicitar todos los string nombre, apellido, direccion Solicitar todo
												 * lo numerico edad, numeroDireccion Usuario Ingrese saldo($)
												 * 
												 * Validar que usuario sea mayor de edad, minimo en bolsillo $50000
												 * minimo de apuesta $10000 (Si no tiene ese dinero no puede apostar)
												 * 
												 * Cuanto apostar del saldo que tenga
												 * 
												 * Mensaje controlar todo mensaje para todo
												 *
												 */
		// Asigno las variables que utilizare
		Scanner sc = new Scanner(System.in);// metodo para recoger datos del usuario
		Random random = new Random();
		int mayoriaEdad = 18;// Variable con el valor que indica la mayoria de edad
		int saldoMinimo = 10000; // Saldo minimo para ingresar al casino
		boolean salir = false;
		int opcion;// Guardaremos la opcion del usuario para el menu
		int apuesta;// Apuesta que se realiza
		int eleccion;// numero por el cual apuesta
		int min = 1; // numero minimo del azar
		int max = 3; // numero max del azar // Variables String solicitadda
		String nombre;
		String apellido;
		String direccion; // Variables tipo int solicitadas
		int edad;
		int numeroDireccion;
		int saldo;
		// Se solicitan al usuario los datos de nombre,apellido,direccion.
		// tal como indica el ejercicio, en el orden indicado
		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese su apellido");
		apellido = sc.nextLine();
		System.out.println("Ingrese su direccion");
		direccion = sc.nextLine(); // Se solicitan al usuario los datos de tipo numerico
		System.out.println("Ingrese su edad");
		edad = sc.nextInt();
		System.out.println("Ingrese los digitos de su direccion");
		numeroDireccion = sc.nextInt(); // Se solicita al usuario que ingrese el saldo
		System.out.println("Ingrese su saldo");
		saldo = sc.nextInt(); // condiciono si se cumple la mayoria de edad, ejemplo 17< 18 hace esto de abajo
		if (edad < mayoriaEdad) {
			System.out.println("No puedes ingresar ya que eres menor de edad"); // si cumple con la edad y el saldo es
																				// mayor que el minimo para ingresar,
																				// realizamos esto
		}
		if (saldo >= 50000) {

			System.out.println("El nombre de usuario es: " + nombre + " " + apellido);
			System.out.println("Su edad es: " + edad);
			System.out.println("Su direccion es: " + direccion + " " + numeroDireccion);
			System.out.println("Su saldo es: $" + saldo); // utilizar while?
			// Preguntar al usuario si quiere apostar

			// Aun no comprendo muy bien lo del while pero mientras salir sea distinto de
			// false, se realizara esta accion
			while (!salir) {
				// Opciones del menu
				System.out.println("1. Apostar");
				System.out.println("2. Salir");
				System.out.println("Escribe una de las opciones");
				// Solicito la opcion del usuario
				opcion = sc.nextInt();
				switch (opcion) {// Es una opcion de multiples vias, segun el caso y la opcion que se marque es
									// lo que se realiza
				// Primer caso de seleccionar este realiza lo que esta dentro
				case 1:
					System.out.println("Has seleccionado la opcion 1");

					// Solicito el numero por el cual se apostara
					System.out.println("Que numero eliges del 1 al 3");
					eleccion = sc.nextInt();

					// Cuanto desea apostar
					System.out.println("Cuanto deseas apostar");
					apuesta = sc.nextInt();

					// Resto la apuesta del saldo total
					saldo = saldo - apuesta;

					// imprimo el saldo despues de la apuesta
					System.out.println("Saldo despues de la apuesta: $" + saldo + "\n");

					// Funcion del numero al azar (max numero que arrojara - min numero que
					// arrojara)
					int numeroAzar = random.nextInt(max - min) + min;// Nose que funcion tiene el + min xd
					// Imprimo el numero que arrojo la funcion anterior
					System.out.println("el numero al azar es: " + numeroAzar);

					// Si el valor de value (numeroAzar == eleccion del usuario) Gana!
					if (numeroAzar == eleccion) {
						// sumar el saldo despues de la apuesta + la apuesta x 2 (la apuesta + lo ganado
						// por la apuesta)
						saldo = saldo + (apuesta * 2);

						System.out.println("Has ganado!! tu nuevo saldo es: $" + saldo);

						// Si no gana imprimir el siguiente mensaje
					} else {

						System.out.println("Has perdido, el saldo que te queda es: $" + saldo);
					}

					break;// Termina el switch y vuelve al inicio //Segundo caso
				case 2:
					// Se asigna el valor true para salir del while
					salir = true;
					System.out.println("Haz salido...");
					break;// Sale del switch
				default:
					// En el caso de no ingresar 1 o 2
					System.out.println("Solo número 1 o 2");
				}
			}

			// Si el saldo es insuficiente arroja este mensaje
		} else {
			System.out.println("Tu saldo de: $" + saldo + " no es sufiente para entrar");
		}
	}
}