package com.softtek.pruebasunitarias1;

import com.softtek.pruebasunitarias1.ejercicio1.model.Circulo;
import com.softtek.pruebasunitarias1.ejercicio1.model.Figura;
import com.softtek.pruebasunitarias1.ejercicio1.model.Rectangulo;
import com.softtek.pruebasunitarias1.ejercicio1.model.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PruebasUnitarias1ApplicationTests {

	@Test
	void contextLoads() {
	}

	private Figura figura;
	private Circulo circulo;
	private Rectangulo rectangulo;

	@BeforeEach
	public void init() {
		figura = new Figura(5, 10);
		circulo = new Circulo(1, 2, 5.0);
		rectangulo = new Rectangulo(3, 4, 5.0, 6.0);
	}

	@Test
	public void testFiguraPosition() {
		int[] expected = {5, 10};
		assertArrayEquals(expected, figura.getPosition());
	}

	@Test
	public void testCirculoPosition() {
		int[] expected = {1, 2};
		assertArrayEquals(expected, circulo.getPosition());
	}

	@Test
	public void testCirculoArea() {
		double expected = Math.PI * 25.0;
		assertEquals(expected, circulo.getArea(), 0.0001);
	}

	@Test
	public void testRectanguloPosition() {
		int[] expected = {3, 4};
		assertArrayEquals(expected, rectangulo.getPosition());
	}

	@Test
	public void testRectanguloArea() {
		double expected = 30.0;
		assertEquals(expected, rectangulo.getArea(), 0.0001);
	}

	//Calculadora tests
	private Calculadora calculadora;

	@BeforeEach
	public void initCalc() {
		calculadora = new Calculadora();
	}

	@Test
	public void testSuma() {
		assertEquals(5.0, calculadora.suma(2.0, 3.0), 0.0001);
	}

	@Test
	public void testResta() {
		assertEquals(-1.0, calculadora.resta(2.0, 3.0), 0.0001);
	}

	@Test
	public void testMultiplica() {
		assertEquals(6.0, calculadora.multiplica(2.0, 3.0), 0.0001);
	}

	@Test
	public void testDivide() {
		assertEquals(2.0, calculadora.divide(6.0, 3.0), 0.0001);
	}

	@Test
	public void testDividePorCero() {
		assertThrows(IllegalArgumentException.class, () -> calculadora.divide(6.0, 0.0));
	}

}
