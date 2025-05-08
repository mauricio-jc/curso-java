package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do quanto: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in (dd/MM/yyyy): ");
		Date checkIn = simpleDateFormat.parse(sc.next());
		
		System.out.print("Check-out (dd/MM/yyyy): ");
		Date checkOut = simpleDateFormat.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: a data de check-out deve ser posterior à data de check-in");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar a reserva:");
			System.out.print("Check-in (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(sc.next());
			
			System.out.print("Check-out (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(sc.next());
			
			Date now = new Date();
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro na reserva: as datas de reserva para atualização devem ser datas futuras");
			}
			else if(!checkOut.after(checkIn)) {
				System.out.println("Erro na reserva: a data de check-out deve ser posterior à data de check-in");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println(reservation);
			}
		}
		
		sc.close();
	}
}












