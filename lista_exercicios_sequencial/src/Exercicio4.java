import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int number;
		double valueHour;
		double workedHours;
		double salary;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o código do funcionário: ");
		number = sc.nextInt();
		
		System.out.print("Informe a quantidade de horas trabalhas do funcionário: ");
		workedHours = sc.nextDouble();
		
		System.out.print("Informe o valor da hora: ");
		valueHour = sc.nextDouble();
		
		salary = workedHours * valueHour;
		
		System.out.println("Código do funcionário: " + number);
		System.out.println("Salário do funcionário: " + salary);
		
		sc.close();
	}

}
