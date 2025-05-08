package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum = sum + vect[i];
		}
		
		System.out.print("Valores: ");
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f	", vect[i]);
		}
		
		System.out.println();
		System.out.printf("Soma: %.2f%n", sum);
		
		double average = sum / n;
		System.out.printf("Média: %.2f%n", average);
		
		sc.close();
	}
}