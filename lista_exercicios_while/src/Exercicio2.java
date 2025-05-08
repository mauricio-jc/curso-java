//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("Informe a coordenada X: ");
		x = sc.nextInt();
		
		System.out.print("Informe a coordenada Y: ");
		y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("Primeiro");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Segundo");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Terceiro");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Quarto");
		}
		else {
			System.out.println("Origem");
		}
		
		while(x != 0 && y != 0) {
			System.out.print("Informe a coordenada X: ");
			x = sc.nextInt();
			
			System.out.print("Informe a coordenada Y: ");
			y = sc.nextInt();
			
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else if(x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			else {
				System.out.println("Origem");
			}
		}
		
		sc.close();
	}
}