package Desafio;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
			

			Scanner sc = new Scanner(System.in);
			
			double Celsius;
			System.out.println("Digite os Graus:");
			Celsius = sc.nextDouble();
			
			double fahrenheit;
			fahrenheit =(Celsius *9/5)+32;
			
			double kelvin;
			kelvin =(Celsius +273.15);

			System.out.println("A quantidade de Celsius em Fahrenheit é " + fahrenheit) ;
					
			System.out.println("");

			System.out.println("A quantidade de Celsius em Kelvin é " + kelvin) ;

			sc.close();

	}
}
