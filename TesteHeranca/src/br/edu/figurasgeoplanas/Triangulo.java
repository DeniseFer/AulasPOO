package br.edu.figurasgeoplanas;

public class Triangulo extends FigPlanas{
	private double altura;
	private double base;
	
	public Triangulo() {
		this.altura =0;
		this.base = 0;
		
	}
	
	// VALOR AOS ATRIBUTOS
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	// CALCULA AREA
	public void getCalcArea() {
		this.area = base*altura/2;
		System.out.println("Area: "+ area);
	}
	
	
}
