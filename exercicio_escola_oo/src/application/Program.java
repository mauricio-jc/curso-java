package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Informe os dados do aluno:");
		System.out.print("Nome: ");
		student.name = sc.nextLine();
		
		System.out.print("Nota 1: ");
		student.note1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		student.note2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		student.note3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}
}