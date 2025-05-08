import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int a, b, c, d;
		int multiplicacao1, multiplicacao2, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de a: ");
		a = sc.nextInt();
		System.out.print("Informe o valor de b: ");
		b = sc.nextInt();
		System.out.print("Informe o valor de c: ");
		c = sc.nextInt();
		System.out.print("Informe o valor de d: ");
		d = sc.nextInt();
		
		multiplicacao1 = a * b;
		multiplicacao2 = c * d;
		
		diferenca = multiplicacao1 - multiplicacao2; 
		
		System.out.printf("O valor da diferença é %d%n", diferenca);
		
		sc.close();
	}

}
