package Secao08_IntroOrientadoObjetos.membros_estaticos.application;

import Secao08_IntroOrientadoObjetos.membros_estaticos.util.Calculator;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        System.out.printf("Circunference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }
}
