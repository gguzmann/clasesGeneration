package com.generation.jun01;

import java.util.ArrayList;
import java.util.List;

import com.generation.jun01.modelos.Gato;
import com.generation.jun01.modelos.Mascota;
import com.generation.jun01.modelos.Mishi;
import com.generation.jun01.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HERENCIA:");
		System.out.println("******************************");
		
		Mascota mascota = new Mascota();
		mascota.setColor("Rojo");
		mascota.setNombre("Cachupin");
		
		Perro perro = new Perro();
		Gato gato = new Gato();
		Mishi mishi = new Mishi(true);

		System.out.println(gato.toString());
		System.out.println(perro.toString());
		System.out.println(mishi.toString());

		System.out.println("");
		System.out.println("POLIFORMISMO:");
		System.out.println("******************************");
		// Polimorfismmo
		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		Mascota regalon = new Mascota("Negro", "Canino", "Pelo", "Firulais", 15f, "Femenino");
		Gato felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setEspecie("Felino");

		Mascota chocolo = new Perro();
		chocolo.setNombre("Chocolo");
		chocolo.setPeso(15);
		
		listaMascotas.add(chocolo);
		listaMascotas.add(regalon);
		listaMascotas.add(felix);
		//System.out.println(listaMascotas);
		//listaMascotas.forEach(e -> e.hacerSonido());
		
		for (Mascota masc : listaMascotas)
		{
			System.out.println(masc);
			masc.hacerSonido();
		}
		
		Perro perroChocolo = (Perro) chocolo;
	}

}
