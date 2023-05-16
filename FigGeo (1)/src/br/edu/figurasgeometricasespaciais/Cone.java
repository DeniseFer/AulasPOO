package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;

public class Cone extends FigEspaciais{
	Scanner sc = new Scanner(System.in);

	private double g;
	private double raio;
	private double areaLateral;
	private double areaBase;
	private double altura;
	
	
	public Cone(){
		raio = 0.0;
		altura = 0.0;
	}
	
	public void setListaAtributos() {
		System.out.println("Digite o valor da altura: ");
		altura  = sc.nextDouble();
		System.out.println("Digite o valor do raio: ");
		raio  = sc.nextDouble();

	}
	
	public void getCalcAreaLateral() {
		g = Math.sqrt(altura*altura + raio *raio);
		areaLateral = raio * Math.PI * g;
		System.out.println("O valor da área lateral é: " + areaLateral);
		System.out.println(" ");
	}
	
	public void getCalcAreaBase() {
		areaBase = Math.PI * raio *raio;
		System.out.println("O valor da área da base é: " + areaBase);
		System.out.println(" ");
	}
	public void getCalcAreaTotal() {
		areaTotal = areaBase + areaLateral;
		System.out.println("O valor da área total é: " + areaTotal);
		System.out.println(" ");
	}
	
	public void getCalcVolume() {
		volume = 1/3 * raio * raio *altura * Math.PI;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}
	
		
	
	

}

