package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import models.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date: ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date: ");
		Date checkOut = sdf.parse(sc.next());
		
		if (checkIn.before(checkOut)){
		
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.print(reservation);
			
			System.out.println();
			System.out.println();
			
			System.out.print("Update reservation: ");		
			System.out.print("Check-in date: ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date: ");
			checkOut = sdf.parse(sc.next());
			Date atual = new Date();
			
			
			if (!atual.after(checkIn) || !atual.after(checkOut)  ) {
				
				reservation.updateDates(checkIn, checkOut);
				System.out.print(reservation);
				
				
			}else {
							
				System.out.print("Atualização somente permitida para uma data posterior");
				System.out.print(sdf.format(atual));
				
				}
			
			
			
			
		}else {
			System.out.print("Data de saida não pode anterior a de entrada");
		}
		

	}

}
 