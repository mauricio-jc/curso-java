package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();
		
		System.out.print("Informe o número de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do produto #" + i);
			
			System.out.print("Comum, Usado, Importado (c/u/i): ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			
			if(type == 'c') {
				Product product = new Product(name, price);
				products.add(product);
			}
			
			if(type == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product product = new UsedProduct(name, price, manufactureDate);
				products.add(product);
			}
			
			if(type == 'i') {
				System.out.print("Taxa da alfândega: ");
				double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				products.add(product);
			}
		}
		
		System.out.println();
		System.out.println("Etiquetas de preço:");
		
		for(Product product: products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}