// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		double total;
		
		System.out.println("CÓDIGO ---------- ESPECIFICAÇÃO -------------- PREÇO");
		System.out.println("1 --------------- Cachorro quente ------------ R$ 4.00");
		System.out.println("2 --------------- X-Salada ------------------- R$ 4.50");
		System.out.println("3 --------------- X-Bacon -------------------- R$ 5.00");
		System.out.println("4 --------------- Torrada Simples ------------ R$ 2.00");
		System.out.println("5 --------------- Refrigerante --------------- R$ 1.50");
		System.out.println("------------------------------------------------------");
		System.out.println("------------------------------------------------------");
		
		System.out.print("Informe o códido do pedido: ");
		codigo = sc.nextInt();
		
		System.out.print("Informe a quantidade do item do pedido: ");
		quantidade = sc.nextInt();
		
		switch (codigo) {
			case 1: {
				total = 4.00 * quantidade;
				System.out.println("Total a pagar: R$ " + total);
				break;
			}
			case 2: {
				total = 4.50 * quantidade;
				System.out.println("Total a pagar: R$ " + total);
				break;
			}
			case 3: {
				total = 5.00 * quantidade;
				System.out.println("Total a pagar: R$ " + total);
				break;
			}
			case 4: {
				total = 2.00 * quantidade;
				System.out.println("Total a pagar: R$ " + total);
				break;
			}
			case 5: {
				total = 1.50 * quantidade;
				System.out.println("Total a pagar: R$ " + total);
				break;
			}
			default:
				System.out.println("Código inválido");
				break;
		}
		
		sc.close();
	}

}
