package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<Shape>();
		
		System.out.print("Informe o número de figuras: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Informe os dados da figura #" + i);
			
			System.out.print("Retângulo ou círculo (r/c)? ");
			char option = sc.next().charAt(0);
			
			System.out.print("Cor (BLACK / BLUE / RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(option == 'r') {
				System.out.print("Largura: ");
				double width = sc.nextDouble();
				
				System.out.print("Altura: ");
				double height = sc.nextDouble();
				
				shapes.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println("Áreas das figuras:");
		for(Shape shape: shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}