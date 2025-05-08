//Quantas pessoas serao digitadas? 5
//Altura da 1a pessoa: 1.70
//Genero da 1a pessoa: F
//Altura da 2a pessoa: 1.83
//Genero da 2a pessoa: M
//Altura da 3a pessoa: 1.54
//Genero da 3a pessoa: M
//Altura da 4a pessoa: 1.61
//Genero da 4a pessoa: F
//Altura da 5a pessoa: 1.75
//Genero da 5a pessoa: F
//Menor altura = 1.54
//Maior altura = 1.83
//Media das alturas das mulheres = 1.69
//Numero de homens = 2 

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double menorAltura = 999999999;
		double maiorAltura = 0;
		double somaAlturaMulheres = 0;
		int quantidadeHomens = 0;
		int quantidadeMulheres = 0;
		Pessoa[] pessoa = new Pessoa[n];
		sc.nextLine();
		
		for(int i = 0; i < pessoa.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().charAt(0);
			
			pessoa[i] = new Pessoa(altura, genero);
			
			if(pessoa[i].getGenero() == 'M') {
				quantidadeHomens++;
			}
			else {
				somaAlturaMulheres = somaAlturaMulheres + pessoa[i].getAltura();
				quantidadeMulheres++;
			}
			
			if(pessoa[i].getAltura() < menorAltura) {
				menorAltura = pessoa[i].getAltura();
			}
			
			if(pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}
		}
		
		double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.println("Número de homens = " +  quantidadeHomens); 
		
		sc.close();
	}
}