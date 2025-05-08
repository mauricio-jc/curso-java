package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int somaPares = 0;
		int quantidadePares = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if((vect[i] % 2) == 0) {
				somaPares = somaPares + vect[i];
				quantidadePares++;
			}
		}
		
		if(quantidadePares == 0) {
			System.out.println("Nenhum número par");
		}
		else {
			double media = somaPares / quantidadePares;
			System.out.printf("Média dos pares: %.1f", media);
		}
		
		sc.close();
	}
}