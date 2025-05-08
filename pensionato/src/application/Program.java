package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		sc.nextLine();
		Aluno[] aluno = new Aluno[10];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Aluguel #" + (i + 1) + ":");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			aluno[quarto] = new Aluno(nome, email);
		}
		
		System.out.println("Quartos ocupados:");
		for(int i = 0; i < aluno.length; i++) {
			if(aluno[i] != null) {
				System.out.println(i + ": " + aluno[i].toString());
			}
		}
		
		sc.close();
	}
}