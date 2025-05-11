package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de números: ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		for(int i = 1; i <= quantity; i++) {
			System.out.print("Informe o número #" + i + ": ");
			int number = sc.nextInt();
			sc.nextLine();
			
			ps.addValue(number);
		}
		
		ps.print();
		System.out.println("Primeiro número: " + ps.first());
		
		sc.close();
	}
}