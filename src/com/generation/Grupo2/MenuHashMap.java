package com.generation.Grupo2;

import java.util.HashMap;
import java.util.Scanner;

public class MenuHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap objHashMap = new HashMap();

		// Agregando keys y values al objHasMap .put
		objHashMap.put("menu1", "pastel de choclo");
		objHashMap.put("menu2", "humitas");
		objHashMap.put("menu3", "porotos con riendas");
		objHashMap.put("menu4", "sopaipilla pasadas <3");
		objHashMap.put("menu5", "milanesa con pure");

		System.out.println("Platos disponible Casino Grupo2");
		System.out.println("Los platos disponible son: " + objHashMap);
		// {menu1="",menu2=""}
		System.out.println("¿Que menu quieres?");
		String platoUsuario = sc.next();

		System.out.println("El Menu elegido fue: " + objHashMap.get(platoUsuario));
	}

}
