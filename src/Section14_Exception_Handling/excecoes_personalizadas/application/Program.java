package Section14_Exception_Handling.excecoes_personalizadas.application;

import Section14_Exception_Handling.excecoes_personalizadas.model.entities.Reservation;
import Section14_Exception_Handling.excecoes_personalizadas.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = scanner.nextInt();
            System.out.println("Check-in date: (dd/MM/yyyy): ");
            Date checkIn = formatter.parse(scanner.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = formatter.parse(scanner.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter data to update the reservation:");
            System.out.println("Check-in date: (dd/MM/yyyy): ");
            checkIn = formatter.parse(scanner.next());
            System.out.println("Check-out date: (dd/MM/yyyy): ");
            checkOut = formatter.parse(scanner.next());


            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format!");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error!");
        }

        scanner.close();
    }
}
