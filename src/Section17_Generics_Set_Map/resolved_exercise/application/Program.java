package Section17_Generics_Set_Map.resolved_exercise.application;

import Section17_Generics_Set_Map.resolved_exercise.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrintService printService = new PrintService();

        System.out.print("How many values? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("First: " + printService.first());
        scanner.close();
    }
}
