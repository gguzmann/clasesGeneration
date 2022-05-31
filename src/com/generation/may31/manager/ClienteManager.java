package com.generation.may31.manager;

import java.util.List;

import com.generation.may31.Cliente;


public class ClienteManager {
	// Funcion que permita recorrer el arreglo
	
	public void printArray(List<Cliente> clientList)
	{
		System.out.println("ID Name Rut");
		for (Cliente client : clientList)
		{
			System.out.println(client.getId() + " " + client.getNombre() + " " + client.getRut());
		}
	}

}