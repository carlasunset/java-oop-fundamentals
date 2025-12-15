package Secao11_DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();

        LocalDate date4 = LocalDate.parse("2025-11-13");
        LocalDateTime date5 = LocalDateTime.parse("2025-11-13T22:25:06");
        Instant date6 = Instant.parse("2025-11-13T22:25:06Z");
        Instant date7 = Instant.parse("2025-11-13T22:25:06-03:00"); //here I specified the timezone -03:00

        //https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date8 = LocalDate.parse("22/04/2025", formatter);
        LocalDateTime date9 = LocalDateTime.parse("22/04/2025 19:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate date10 = LocalDate.of(2025, 4, 22);
        LocalDateTime date11 = LocalDateTime.of(2025, 4, 22, 19, 30);

        System.out.println("LocalDate now: " + date1);
        System.out.println("LocalDateTime now: " + date2);
        System.out.println("Instant now -> GMT timezone: " + date3);
        System.out.println("LocalDate customized date: " + date4);
        System.out.println("LocalDateTime customized date: " + date5);
        System.out.println("Instant customized date: " + date6);
        System.out.println("Instant customized date: " + date7); //the output will be 3 hours delayed
        System.out.println("LocalDate customized date providing an specific format 22/04/2025: " + date8);
        System.out.println("LocalDateTime customized datetime providing an specific format 22/04/2025 19:30: " + date9);


    }
}
