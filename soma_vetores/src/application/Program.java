package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantity = sc.nextInt();
		int[] vectA = new int[quantity];
		int[] vectB = new int[quantity];
		int[] vectC = new int[quantity]; 
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < quantity; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < quantity; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante:");
		for(int i = 0; i < quantity; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}
}