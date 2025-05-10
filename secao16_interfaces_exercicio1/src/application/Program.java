package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), formatter);

		System.out.print("Valor do contrato: ");
		double value = sc.nextDouble();
		sc.nextLine();
		
		Contract contract = new Contract(number, date, value);
		
		System.out.print("Entre com o numero de parcelas: ");
		int installments = sc.nextInt();
		sc.nextLine();
			
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, installments);
		
		System.out.println("Parcelas:");
		for (Installment Installment: contract.getInstallments()) {
			System.out.println(Installment);
		}
		
		sc.close();
	}
}