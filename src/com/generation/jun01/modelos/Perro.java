package com.generation.jun01.modelos;

public class Perro extends Mascota{

	private boolean ladrar;
	
	public Perro()
	{
		
	}
	
	public Perro(boolean ladrar)
	{
		this.ladrar = ladrar;
	}

	public boolean isLadrar() {
		return ladrar;
	}

	public void setLadrar(boolean ladrar) {
		this.ladrar = ladrar;
	}

	@Override
	public String toString() {
		return "Perro [ladrar=" + ladrar + "]" + super.toString();
	}
	
	@Override
	public void hacerSonido()
	{
		System.out.println("Guau, guau");
	}

	
	
	
}
