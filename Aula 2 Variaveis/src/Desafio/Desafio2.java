package Desafio;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float capitalInicial;
		System.out.println("Digite a Capital Inicial:");
		capitalInicial = sc.nextFloat();
		
		
		float taxaDeJuros;
		System.out.println("Digite a porcentagem de juros ao mes:");
		taxaDeJuros = sc.nextFloat();
		
		int meses;
		System.out.println("Digite a quantidade de meses:");
		meses = sc.nextInt();
		
		double potencia = Math.pow(taxaDeJuros, meses);
		
		double montante = capitalInicial* (1 + taxaDeJuros) * potencia ;
		
		
		System.out.println("A quantidade montate vai ser " + montante) ;
		
	}

}
