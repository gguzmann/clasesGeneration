package com.generation.may31;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.may31.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ClienteManager cm = new ClienteManager();
		
		int opcion = 0;
		List<Cliente> listaCliente = new ArrayList<Cliente>();

		do {
			Cliente cliente = new Cliente();
			try {
				System.out.println("Ingrese ID de Cliente");
				String idString = sc.nextLine();
				//Integer id = sc.nextInt();
				Integer id = Integer.parseInt(idString);
				cliente.setId(id);
				//sc.nextLine();

				System.out.println("Ingrese Nombre de Cliente");
				String nombre = sc.nextLine();
				cliente.setNombre(nombre);

				System.out.println("Ingrese Rut de Cliente");
				String rut = sc.nextLine();
				cliente.setRut(rut);

			} catch (NullPointerException npe) {
				System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
			} catch (InputMismatchException ime) {
				System.out.println("Error en el ingreso de un dato");
			} catch (NumberFormatException nfe) {
				System.out.println("No puede ingresar un letra como identificador " + nfe);
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error, contecte al administrador " + e);
			}

			//System.out.println(cliente.toString());

			listaCliente.add(cliente);
			
			
			
			do {
				System.out.println("Ingresar nuevo Cliente? (1) Si (2) No");
				opcion = sc.nextInt();
			} while (opcion < 1 || opcion > 2);

			sc.nextLine();
		} while (opcion == 1);
		

		cm.printArray(listaCliente);
	}

}
