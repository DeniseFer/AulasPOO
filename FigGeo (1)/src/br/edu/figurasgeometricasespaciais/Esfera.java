package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Esfera extends FigEspaciais{

	Scanner sc = new Scanner (System.in);
	
	private double raio;
	
	public Esfera() {
		raio = 0.0;
		
	}
	public void setListaAtributos() {
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
	}

	
	public void getCalcAreaTotal() {
		areaTotal = 4 * Math.PI * raio * raio;
		System.out.println("O valor da área é: " + areaTotal);
		System.out.println(" ");
	}
	
	public void getCalcVolume() {
		volume = 4/3 * Math.PI * raio * raio * raio;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}
	
	
	
	
}


