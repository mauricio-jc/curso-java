import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Olá Mundo!");

//		String product1 = "Computador";
//		String product2 = "Mesa de escritório";
//		int age = 30;
//		int code = 5290;
//		char gender = 'M';
//		double price1 = 2100.0;
//		double price2 = 650.50;
//		double measure = 53.234567;
//		System.out.println("Products:");
//		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
//		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
//		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
//		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
//		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
//		Locale.setDefault(Locale.US);
//		System.out.printf("US decimal point: %.3f%n", measure);

//		Scanner sc = new Scanner(System.in);
//		String texto = sc.next();
//		System.out.println("Você digitou: " + texto);
		
//		int age = sc.nextInt();
//		System.out.println("Você digitou: " + age);
		
//		double price = sc.nextDouble();
//		System.out.println("Você digitou: " + price);
		
//		char gender = sc.next().charAt(0);
//		System.out.println("Você digitou: " + gender);
		
//		System.out.print("Informe seu nome: ");
//		String name = sc.nextLine();
//		
//		System.out.print("Informe seu cpf: ");
//		String cpf = sc.nextLine();
//		
//		System.out.print("Informe sua idade: ");
//		int age = sc.nextInt();
//		
//		System.out.println("Dados informados:");
//		System.out.println("Nome: " + name);
//		System.out.println("CPF: " + cpf);
//		System.out.println("Idade: " + age);
//		sc.close();
		
		double number = 16.0;
		double sqrtRoot = Math.sqrt(number);
		double number2 = 2.0;
		double pow = Math.pow(number2, 4);
		double number3 = -10.0;
		double abs = Math.abs(number3);
		
		System.out.printf("Raíz quadrada de %.1f é %.1f%n", number, sqrtRoot);
		System.out.printf("%.1f na potência de 4 é %.1f%n", number2, pow);
		System.out.printf("O valor absoluto de %.1f é %.1f%n", number3, abs);
	}
}



















