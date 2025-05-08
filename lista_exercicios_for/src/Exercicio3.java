//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//peso 5.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Informe a quantidade: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Informe o valor 1: ");
			double valor1 = sc.nextDouble();
			System.out.print("Informe o valor 2: ");
			double valor2 = sc.nextDouble();
			System.out.print("Informe o valor 3: ");
			double valor3 = sc.nextDouble();
			
			double mediaPonderada = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (2 + 3 +5);
			System.out.printf("Média ponderada: %.1f%n", mediaPonderada);
		}
		
		sc.close();
	}
}