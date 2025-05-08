//Quantas pessoas serao digitadas? 5
//Dados da 1a pessoa:
//Nome: Joao
//Idade: 15
//Altura: 1.82

//Dados da 2a pessoa:
//Nome: Maria
//Idade: 16
//Altura: 1.60

//Dados da 3a pessoa:
//Nome: Teresa
//Idade: 14
//Altura: 1.58

//Dados da 4a pessoa:
//Nome: Carlos
//Idade: 21
//Altura: 1.65

//Dados da 5a pessoa:
//Nome: Paulo
//Idade: 17
//Altura: 1.78
//Altura média: 1.69
//Pessoas com menos de 16 anos: 40.0%
//Joao
//Teresa 

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int quantity = sc.nextInt();
		
		User[] vect = new User[quantity];
		
		double sumHeight = 0;
		int underSixteenYears = 0; 
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sumHeight = sumHeight + height;
			
			if(age < 16) {
				underSixteenYears++;
			}
			
			vect[i] = new User(name, age, height);
		}
		
		double averageHeight = sumHeight / quantity;
		System.out.printf("Altura média: %.2f%n", averageHeight);
		
		double percentage = (underSixteenYears * 100) / quantity;
		
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", percentage) + "%");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.printf("%s%n", vect[i].getName());
			}
		}
		
		sc.close();
	}
}