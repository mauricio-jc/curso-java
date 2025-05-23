package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados? ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		for(int i = 1; i <= quantidade; i++) {
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			funcionarios.add(funcionario);
		}
		
		System.out.print("Entre com o ID do funcionário para aumentar o salário: ");
		int funcionarioId = sc.nextInt();
		sc.nextLine();
		
		Funcionario find = funcionarios.stream().filter(item -> item.getId() == funcionarioId).findFirst().orElse(null);
		
		if(find == null) {
			System.out.println("Este ID não existe");
		}
		else {
			System.out.print("Informe a porcentagem de aumento: ");
			double percentage = sc.nextDouble();
			sc.nextLine();
			
			find.setSalario(percentage);
		}
		
		System.out.println("Lista de funcionários:");
		for(Funcionario item: funcionarios) {
			System.out.println(item);
		}
		
		sc.close();
	}
}