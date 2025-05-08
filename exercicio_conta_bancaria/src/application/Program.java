package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount;
		double value = 0;
		
		System.out.print("Informe o número da conta: ");
		int number = sc.nextInt();
		
		System.out.print("Informe o nome do títular da conta: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Deseja fazer um depósito inicial (s/n)? ");
		char option = sc.next().charAt(0);
		
		while(option != 's' && option != 'n') {
			System.out.println("Opção incorreta:");
			System.out.print("Deseja fazer um depósito inicial (s/n)? ");
			option = sc.next().charAt(0);
		}
		
		if(option == 's') {
			System.out.print("Informe o valor do depósito: ");
			value = sc.nextDouble();
			bankAccount = new BankAccount(number, name, value);
		}
		else {
			bankAccount = new BankAccount(number, name);
		}
				
		System.out.println(bankAccount);
		
		System.out.print("Informe um valor para depositar: ");
		value = sc.nextDouble();
		bankAccount.deposit(value);
		
		System.out.println(bankAccount);
		
		System.out.print("Informe um valor para sacar: ");
		value = sc.nextDouble();
		bankAccount.withdraw(value);
		
		System.out.println(bankAccount);
		
		sc.close();
	}
}