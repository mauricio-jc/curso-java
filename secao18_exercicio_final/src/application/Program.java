package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o arquivo: ");
		String path = sc.nextLine();
		
		System.out.print("Informe o salário base: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> list = new ArrayList<Employee>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			double sumSalary = list.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);
			
			List<String> emails = list.stream()
									.filter(e -> e.getSalary() >= salary)
									.map(e -> e.getEmail())
									.sorted()
									.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			System.out.printf("Soma dos salários das pessoas cujo nome começa com 'M': %.2f%n", sumSalary);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}