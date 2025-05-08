import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double raio;
		double pi = 3.14159;
		double area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("Informe da área é %.4f%n", area);
		
		sc.close();
	}
}