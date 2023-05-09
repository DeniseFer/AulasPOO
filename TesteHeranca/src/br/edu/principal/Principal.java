package br.edu.principal;

import br.edu.figurasgeoplanas.*;

public class Principal {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo();
		t1.setAltura(15);
		t1.setBase(2);
		t1.getCalcArea();
		
		Quadrado q1 = new Quadrado();
		q1.setLado(2);
		q1.getCalcArea();
	}

}
