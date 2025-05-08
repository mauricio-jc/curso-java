package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double percentage = 0;
		
		Employee employee = new Employee();
		
		System.out.println("Preencha os dados do funcionário:");
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.print("Porcentagem de aumento do salário: ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println(employee);
		
		sc.close();
	}
}