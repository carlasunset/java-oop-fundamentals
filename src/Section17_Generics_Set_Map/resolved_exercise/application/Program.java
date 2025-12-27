package Section17_Generics_Set_Map.resolved_exercise.application;

import Section17_Generics_Set_Map.resolved_exercise.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService printService = new PrintService();

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        // Mixing different types is allowed when using Object,
        // but can cause ClassCastException later
        printService.addValue(140);

        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            printService.addValue(value);
        }

        printService.print();

        // Explicit casting is required because PrintService returns Object
        // This is unsafe and may cause runtime errors
        String firstValue = (String) printService.first();

        System.out.println("First: " + firstValue);
        scanner.close();
    }
}
