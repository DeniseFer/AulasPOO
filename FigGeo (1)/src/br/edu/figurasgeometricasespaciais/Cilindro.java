package br.edu.figurasgeometricasespaciais;
import java.util.Scanner;

public class Cilindro extends FigEspaciais{
Scanner sc = new Scanner (System.in);
	

	private double raio;
	private double areaLateral;
	private double areaBase;
	private double altura;


	public Cilindro () {
		raio = 0.0;
		altura = 0.0;
			
	}
	
	public void setListaAtributos() {
		System.out.println("Digite o valor da altura: ");
		altura  = sc.nextDouble();
		System.out.println("Digite o valor do raio: ");
		raio  = sc.nextDouble();

	}
	
	
	public void getCalcAreaBase() {
		areaBase = Math.PI * raio *raio;
		System.out.println("O valor da área da base é: " + areaBase);
		System.out.println(" ");
	}
	
	public void getCalcAreaLateral() {
		areaLateral =  2 * raio * Math.PI * altura;
		System.out.println("O valor da área lateral é: " + areaLateral);
		System.out.println(" ");
	}
	
	public void getCalcAreaTotal() {
		areaTotal = areaBase + areaLateral;
		System.out.println("O valor da área total é: " + areaTotal);
		System.out.println(" ");
	}
	
	public void getCalcVolume() {
		volume = altura * areaBase;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}
	
	
	
}
