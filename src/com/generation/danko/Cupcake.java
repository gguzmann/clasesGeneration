package com.generation.danko;

public class Cupcake {
	//esto es añadir las caracteristicas
	private String cupcakes;
	private int precio;
	private String relleno;
	private String decorados;
	
	//esto es el constuctor (click derecho, source)
	public Cupcake(String cupcakes, int precio, String relleno, String decorados) {
		super();
		this.cupcakes = cupcakes;
		this.precio = precio;
		this.relleno = relleno;
		this.decorados = decorados;
	}


	public Cupcake() {
		// TODO Auto-generated constructor stub
	}

// esto son sus get y setters, se necesitan si el atributo es privado
	public String getCupcakes() {
		return cupcakes;
	}


	public void setCupcakes(String cupcakes) {
		this.cupcakes = cupcakes;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getRelleno() {
		return relleno;
	}


	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}


	public String getDecorados() {
		return decorados;
	}


	public void setDecorados(String decorados) {
		this.decorados = decorados;
	}


	public static void main(String[] args) {
		

	}

}

