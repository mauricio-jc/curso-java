package application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import interfaces.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Quantia: ");
			double amount = sc.nextDouble();
			
			System.out.print("Meses: ");
			int months = sc.nextInt();
			sc.nextLine();
			
			InterestService service = new BrazilInterestService(2.0);
			double payment = service.payment(amount, months);
			
			System.out.printf("Pagamento após " + months + " meses: %.2f%n", payment);
		}
		catch(InvalidParameterException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}