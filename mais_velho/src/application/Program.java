package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String nomeMaisVelho = null;
		int maisVelho = 0;
		sc.nextLine();
		User[] users = new User[n];
		
		for(int i = 0; i < users.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			users[i] = new User(nome, idade);
		}
		
		for(int i = 0; i < users.length; i++) {
			if(users[i].getIdade() > maisVelho) {
				maisVelho = users[i].getIdade();
				nomeMaisVelho = users[i].getNome();
			}
		}
		
		System.out.print("Pessoa mais velha: " + nomeMaisVelho);
		
		sc.close();
	}
}
