package br.edu.principal;
import br.edu.figurasgeometricasespaciais.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cone cone1 = new Cone();
		cone1.setListaAtributos();
		cone1.getCalcAreaBase();
		cone1.getCalcAreaLateral();
		cone1.getCalcAreaTotal();
		cone1.getCalcVolume();
		
		Cilindro cilin1 = new Cilindro();
		cilin1.setListaAtributos();
		cilin1.getCalcAreaBase();
		cilin1.getCalcAreaLateral();
		cilin1.getCalcAreaTotal();
		cilin1.getCalcVolume();
		
		Esfera esf1 = new Esfera();
		esf1.setListaAtributos();
		esf1.getCalcAreaTotal();
		esf1.getCalcVolume();
		
		

	}

}
