package com.generation.may26;

public class Funciones {

	public static void main(String[] args) {
		// 4 tipos de Funcion:
		
		saludo();
		suma(2, 5, "3");
		Integer edad = obtenerEdad();
		validarMayoriaEdad(edad);
	}
	/* Nivel de acceso: public - private - protected
	 * static: Sirve para acceder al metodo sin instanciar la clase del metodo.
	 * Tipo de retorno: 
	 * 		- 2 no retornan: 
	 * 			> void solo ejecuta codigo, no retorna nada
	 * 			> 
	 * 		- 2 retornan algo
	 * nombre de la funcion: (camelCase) se escribe con minuscula la primera letra y mayuscula la siguiente palabra
	 * (Parametros a recibir): Hay que definir tipo de datos ha recibir.
	 * */	
	public static void suma(int numero1, Integer numero2, String numeroString){
		System.out.println("Suma de " + numero1 + " + " + numero2 + " + " + numeroString + " es: " + (numero1 + numero2 + Integer.parseInt(numeroString)));
	}

	public static void saludo() {
		System.out.println("Bienvenido");
	}
	
	public static Integer obtenerEdad() {
		Integer edad = 18;
		return edad;
	}
	
	public static boolean validarMayoriaEdad(int edad) {
		if(edad >= 18)
		{
			System.out.println("Es mayor de edad");
			return true;
		}
		System.out.println("Es menor de edad");
		return false;
	}
	
}
