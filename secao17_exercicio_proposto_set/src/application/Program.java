package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Set<Integer> setList = new HashSet<Integer>();
		int students = 0;
		
		System.out.print("Quantos estudantes para o curso A? ");
		students = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < students; i++) {
			System.out.print("Digite o código do aluno: ");
			int code = sc.nextInt();
			sc.nextLine();

			setList.add(code);
		}
		
		System.out.print("Quantos estudantes para o curso B? ");
		students = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < students; i++) {
			System.out.print("Digite o código do aluno: ");
			int code = sc.nextInt();
			sc.nextLine();

			setList.add(code);
		}
		
		System.out.print("Quantos estudantes para o curso C? ");
		students = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < students; i++) {
			System.out.print("Digite o código do aluno: ");
			int code = sc.nextInt();
			sc.nextLine();

			setList.add(code);
		}
	
		System.out.print("Total de alunos: " + setList.size());
		
		sc.close();
	}
}