package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int quantity = sc.nextInt();
		double[] vect = new double[quantity];
		double greaterValue = 0;
		int position = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if(vect[i] > greaterValue) {
				greaterValue = vect[i];
				position = i;
			}
		}
		
		System.out.printf("Maior valor: %.2f%n", greaterValue);
		System.out.printf("Posição do maior valor: %d%n", position);
		
		sc.close();
	}
}
