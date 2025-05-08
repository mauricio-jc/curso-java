import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor de A: ");
		a = sc.nextInt();
		System.out.print("Informe o valor de B: ");
		b = sc.nextInt();
		System.out.print("Informe o valor de C: ");
		c = sc.nextInt();
		
		sc.close();
	}

}
