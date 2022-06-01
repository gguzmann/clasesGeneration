package com.generation.jun01.modelos;

public class Gato extends Mascota{
	public Boolean garras;
	
	public Gato()
	{
		
	}
	
	public Gato(Boolean garras)
	{
		this.garras = garras;
	}

	public Boolean getGarras() {
		return garras;
	}

	public void setGarras(Boolean garras) {
		this.garras = garras;
	}

	@Override
	public String toString() {
		return "Gato [garras=" + garras + "]";
	}
	@Override
	public void hacerSonido()
	{
		System.out.println("Miau, miau");
	}
	
}