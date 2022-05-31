package com.generation.danko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	List<Cupcake> listaCupcake = new ArrayList<Cupcake>();
	int opcion = 0;
	Cupcake cupcakes = new Cupcake();
	cupcakes.setCupcakes("Vainilla");
	cupcakes.setDecorados("Chispitas");
	cupcakes.setPrecio(1000);
	cupcakes.setRelleno("Nutella");

	
	do {
	Cupcake datosDinamicos = new Cupcake();
	System.out.println("Ingrese tipos de decorado");
	String Decorados = sc.nextLine();
	datosDinamicos.setDecorados(Decorados);
	
	System.out.println("Ingrese tipos de bizcocho");
	String Cupcakes = sc.nextLine();
	datosDinamicos.setCupcakes(Cupcakes);
	
	System.out.println("Ingrese tipos de rellenos");
	String Relleno = sc.nextLine();
	datosDinamicos.setRelleno(Relleno);
	
	System.out.println("Entonces su cupcake sera con decorado de " + Decorados);
	System.out.println("Con un bizcocho de " + Cupcakes);
	System.out.println("Y relleno de "+ Relleno);
	
	//agregar ingredientes a la lista
	listaCupcake.add(datosDinamicos);
	
	System.out.println("¿es correcto? [1] si [0] no");
    opcion = sc.nextInt();
    sc.nextLine();
	//Integer division = 100/0; arroja un error matematico java.lang.ArithmeticException
    }while(opcion == 0);
	//acceder al metodo de otra clase
	//instancia de la clase
	CupcakeManager cm = new CupcakeManager();
	cm.recorrerArreglo(listaCupcake);
	
	}
	
	
	}
 