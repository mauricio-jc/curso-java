package appliacation;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.AccountException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre com os dados da conta:");
			System.out.print("Número: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Títular: ");
			String holder = sc.nextLine();
			
			System.out.print("Saldo inicial: ");
			double balance = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Valor de saque: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			
			System.out.println("Saldo: " + String.format("%.2f", account.getBalance()));
		}
		catch(AccountException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}