package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe uma quantidade: ");
		int n = sc.nextInt();
		double soma = 0;
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Informe a altura: ");
			vect[i] = sc.nextDouble();
			soma = soma + vect[i]; 
		}
		
		double media = soma / n;
		
		System.out.printf("Média: %.2f%n", media);
		
		sc.close();
	}
}