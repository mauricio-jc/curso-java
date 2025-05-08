//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

//N = 5 * (5-1) * (5-2) * (5-3) * (5-4)
//N = 5 * (4) * (3) * (2) * (1)
//N = 120

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade: ");
		int n = sc.nextInt();
		int resultado = 1;
		
		if(n == 0) {
			System.out.println(1);
		}
		else {
			for(int i = 1; i < n; i++) {
				if(resultado == 1) {
					resultado = n * (n - i);
				}
				else {
					resultado = resultado * (n - i);
				}
			}
			
			System.out.println(resultado);
		}
		
		sc.close();
	}
}