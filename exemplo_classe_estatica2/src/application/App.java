package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o preço do dólar: ");
		double priceDollar = sc.nextDouble();
		System.out.print("quanto dólares deseja comprar? ");
		double priceBuy = sc.nextDouble();
		
		double total = CurrencyConverter.convertDollarToReal(priceDollar, priceBuy);
		
		System.out.printf("Total a pagar em reais: R$ %.2f", total);
		
		sc.close();
	}
}