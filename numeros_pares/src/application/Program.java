package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int quantity = sc.nextInt();
		int[] vect = new int[quantity];
		int totalPairsNumbers = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				totalPairsNumbers++;
			}
		}
		
		System.out.println("Números pares: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares: " + totalPairsNumbers);
		
		sc.close();
	}
}