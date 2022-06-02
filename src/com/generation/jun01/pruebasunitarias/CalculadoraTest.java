package com.generation.jun01.pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc = new Calculadora();
	
	
	/*
	 * ASSERT
	 * 
	 * Null
	 * Not Null
	 * Equals
	 * Not Equals
	 * True
	 * False
	 * 
	 */
	
	
	
	@Test
	public void testSumaEquals() {
		int resultado = calc.suma(2, 3);

		//assertEquals(valorEsperado, ResultadoFuncion);
		assertEquals(5, resultado);
	}
	
	@Test
	public void testSumaNotNull() {
		int resultado = calc.suma(2, 3);

		//assertEquals(valorEsperado, ResultadoFuncion);
		assertNotNull(resultado);
	}
	
	
	@Test
	public void testRestaEquals() {
		int resultado = calc.resta(6, 3);
		assertEquals(3, resultado);
	}
	
	@Test
	public void testRestaNotNull() {
		int resultado = calc.resta(68, 28);
		assertNotNull(resultado);
	}
	
	@Test
	public void testMultiplicacion() {
		int resultado = calc.mult(5, 4);
		assertEquals(20, resultado);
	}
	
	
	@Test
	public void testDivision() {
		String resultado = calc.division(10, 0);
		
		assertNotNull(resultado);
		assertEquals("No se puede dividir por 0", resultado);
	}
	
	@Test
	public void testIsParIsTrue() {
		Boolean resultado = calc.isPar(2);
		assertTrue(resultado);
	}
	
	@Test
	public void testIsParNotNull() {
		Boolean resultado = calc.isPar(6);
		assertNotNull(resultado);
	}
	
}