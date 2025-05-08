//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Informe o valor 1: ");
			double valor1 = sc.nextInt();
			
			System.out.print("Informe o valor 2: ");
			double valor2 = sc.nextInt();
			
			if(valor2 == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double divisao = valor1 / valor2;
				System.out.println(divisao);
			}
		}
		
		sc.close();
	}
}