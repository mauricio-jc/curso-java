package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Informe a largura do retângulo: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Informe a altura do retângulo: ");
		rectangle.height = sc.nextDouble();
		
		System.out.printf("Área = %.2f%n", rectangle.area());
		System.out.printf("Perimêtro = %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());
		
		
		sc.close();
	}
}
