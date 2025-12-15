package Secao08_IntroOrientadoObjetos.com_poo.application;

import Secao08_IntroOrientadoObjetos.com_poo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        triangleX.a = scanner.nextDouble();
        triangleX.b = scanner.nextDouble();
        triangleX.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.a = scanner.nextDouble();
        triangleY.b = scanner.nextDouble();
        triangleY.c = scanner.nextDouble();

        System.out.printf("Triangle X area: %.4f%n", triangleX.area());
        System.out.printf("Triangle Y area: %.4f%n", triangleY.area());

        Triangle.largerArea(triangleX, triangleY);
        scanner.close();
    }
}
