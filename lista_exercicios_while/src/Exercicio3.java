//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;
		
		System.out.println("*****************");
		System.out.println("Menu");
		System.out.println("1.Álcool");
		System.out.println("2.Gasolina");
		System.out.println("3.Diesel");
		System.out.println("4.Fim");
		System.out.println("*****************");
		
		System.out.println("Selecione o tipo de combustível: ");
		opcao = sc.nextInt();
		
		switch (opcao) {
			case 1:
				somaAlcool = somaAlcool + 1;
				break;
			case 2:
				somaGasolina = somaGasolina + 1;
				break;
			case 3:
				somaDiesel = somaDiesel + 1;
				break;
			default:
				break;
		}
		
		while(opcao < 1 || opcao != 4) {			
			System.out.println("Selecione o tipo de combustível: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
				case 1:
					somaAlcool = somaAlcool + 1;
					break;
				case 2:
					somaGasolina = somaGasolina + 1;
					break;
				case 3:
					somaDiesel = somaDiesel + 1;
					break;
				default:
					break;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Diesel: " + somaDiesel);
		sc.close();
	}
}