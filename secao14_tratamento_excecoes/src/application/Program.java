package application;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quanto: ");
			int number = sc.nextInt();
			
			System.out.print("Check-in (dd/MM/yyyy): ");
			Date checkIn = simpleDateFormat.parse(sc.next());
			
			System.out.print("Check-out (dd/MM/yyyy): ");
			Date checkOut = simpleDateFormat.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva:");
			System.out.print("Check-in (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(sc.next());
			
			System.out.print("Check-out (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
			
			sc.close();
		}
		catch(ParseException e) {
			System.out.println("ParseException: " + e.getMessage());
		}
		catch(DomainException e) {
			System.out.println("DomainException: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException: Dados de entrada inválidos: " + e);
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado: " + e);
		}
	}
}












