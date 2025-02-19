package variaveis;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite seu nome:");
		nome = sc.next();
		System.out.println("Voce digitou " + nome );
		
		System.out.println("");


		System.out.println("Digite a sua Idade:");
		int idade = sc.nextInt();
		System.out.println("Voce digitou " + idade);
		
		
		System.out.println("");

		System.out.println("Digite a sua Altura:");
		double altura = sc.nextDouble();
		System.out.println("Voce digitou " + altura);

		System.out.println("");


		
		sc.close();

	}

}
