package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		int quantity;
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		
		System.out.print("Preço: ");
		price = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Dados do produto: " + product);
		
		System.out.print("Quantidade para adicionar no estoque: ");
		quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println("Dados do produto: " + product);
		
		System.out.print("Quantidade para remover do estoque: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println("Dados do produto: " + product);
		
		sc.close();
	}
}