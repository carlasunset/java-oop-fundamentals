package Secao08_IntroOrientadoObjetos.membros_estaticos.exercicio;

import java.util.Scanner;

import static Secao08_IntroOrientadoObjetos.membros_estaticos.exercicio.CurrencyConverter.converter;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarAmount = scanner.nextDouble();

        System.out.println("Amount to be paid in reais = " + converter(dolarPrice, dollarAmount));
    }
}
