// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente.

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		int divider;
		
		System.out.print("Informe o número 1: ");
		number1 = sc.nextInt();
		
		System.out.print("Informe o número 2: ");
		number2 = sc.nextInt();
		
		if(number1 < number2) {
			divider = number2 % number1;
		}
		else {
			divider = number1 % number2;
		}
		
		if(divider == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}
}
