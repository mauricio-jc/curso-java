import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int value1;
		int value2;
		int soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor 1: ");
		value1 = sc.nextInt();
		
		System.out.print("Informe o valor 2: ");
		value2 = sc.nextInt();
		
		soma = value1 + value2;
		
		System.out.printf("Resultado da soma é %d%n", soma);
		
		sc.close();
	}
}