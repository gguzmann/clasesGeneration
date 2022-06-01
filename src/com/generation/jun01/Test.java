package com.generation.jun01;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listaFrutas = new ArrayList<>();

		listaFrutas.add("Manzana");
		listaFrutas.add("Pera");
		listaFrutas.add("Platano");
		listaFrutas.add("Uva");
		
		listaFrutas.stream()
			.filter(e -> e.startsWith("P"))
			.forEach(System.out::println);
		

	}

}
