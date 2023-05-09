package br.edu.figurasgeoplanas;

public class Quadrado extends FigPlanas{
	
	private double lado;
	
	public Quadrado() {
		this.lado=0;
		
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public void getCalcArea() {
		area = Math.pow(lado, 2);
		System.out.println("Area: "+area);
	}
	
}
