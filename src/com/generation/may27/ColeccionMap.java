package com.generation.may27;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionMap {

	public static void main(String[] args) {
		// Map <K, V>
		// K => Key
		// V => Value
		
		// FORMAS DE ESCRIBIRLO:
		//HashMap<K, V> map = new HashMap<K,V>();
		//HashMap mapa = new HashMap();
		
		ArrayList<Integer> test = new ArrayList<Integer>();

		test.add(1);
		test.add(44);
		test.add(55);

		HashMap test2 = new HashMap();
		test2.put("test", "test2");
		
		
		HashMap ObjHashMap = new HashMap();
		
		ObjHashMap.put("Nombre", "Gabriel");
		ObjHashMap.put("Apellido", "Guzman");
		ObjHashMap.put("Edad", "29");
		ObjHashMap.put("Array", test);
		ObjHashMap.put("Obj", test2);
		
		System.out.println(ObjHashMap);
		//Devuelve el valor de la key en get
		System.out.println(ObjHashMap.get("Array"));
		
		// Elimina una key y su valor
		//System.out.println(ObjHashMap.remove("Array"));
		
		//Devuelve un array con el nombre de las llaves
		System.out.println(ObjHashMap.keySet());
		// Devuelve solo los valores
		System.out.println(ObjHashMap.values());
		
		System.out.println(ObjHashMap.get("Array"));
	
		for (Object key : ObjHashMap.keySet()) {
			System.out.println(key + ": " + ObjHashMap.get(key));
		}
	}

}
