import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int code1;
		int quantity1;
		double value1;
		int code2;
		int quantity2;
		double value2;
		double total;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o código da peça: ");
		code1 = sc.nextInt();
		System.out.print("Informe a quantidade de peças: ");
		quantity1 = sc.nextInt();
		System.out.print("Informe o valor de cada peça: ");
		value1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Informe o código da peça 2: ");
		code2 = sc.nextInt();
		System.out.print("Informe a quantidade de peças 2: ");
		quantity2 = sc.nextInt();
		System.out.print("Informe o valor de cada peça 2: ");
		value2 = sc.nextDouble();
		
		total = (quantity1 * value1) + (quantity2 * value2);
		
		System.out.println("Valor a pagar: " + total);
		
		sc.close();
	}
}











