// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hourStart, hourEnd, result;
		
		System.out.print("Informe a hora inicial: ");
		hourStart = sc.nextInt();
		
		System.out.print("Informe a hora final: ");
		hourEnd = sc.nextInt();
		
		if(hourStart > hourEnd) {
			result = 24 - hourStart + hourEnd; 
		}
		else if(hourStart == hourEnd) {
			result = 24;
		}
		else {
			result = hourEnd - hourStart;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", result);
		
		sc.close();
	}
}