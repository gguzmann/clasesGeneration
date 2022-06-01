package com.generation.jun01.modelos;

public class Mishi extends Perro{
	private Boolean famoso;
	
	public Mishi(){	
	}
	public Mishi(Boolean famoso){
		this.famoso = famoso;
	}
	
	
	public Boolean getFamoso() {
		return famoso;
	}
	public void setFamoso(Boolean famoso) {
		this.famoso = famoso;
	}
	
	@Override
	public String toString() {
		return "Mishi [famoso=" + famoso + "]" + super.toString();
	}
	
}
