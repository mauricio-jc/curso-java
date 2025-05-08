//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int somaIn = 0;
		int somaOut = 0;
		
		System.out.print("Informe a quantidade: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Informe um valor: ");
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				somaIn = somaIn + 1;
			}
			else {
				somaOut = somaOut + 1;
			}
		}
		
		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");
		
		sc.close();
	}
}