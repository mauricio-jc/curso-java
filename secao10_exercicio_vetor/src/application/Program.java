package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe uma quantidade: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Informe o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Informe o preço do produto: ");
			double price = sc.nextDouble();
			
			Product product = new Product(name, price);
			vect[i] = product;
		}
		
		double sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sum = sum + vect[i].getPrice(); 			
		}
		
		double average = sum / n;
		System.out.printf("Média de preços: %.2f%n", average);
		
		sc.close();
	}
}