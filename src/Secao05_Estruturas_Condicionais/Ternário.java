package Secao05_Estruturas_Condicionais;

import java.util.Scanner;

public class Ternário {
    public static void main(String[] args) {

        // (condição a ser testada) ? valor_se_verdadeiro : valor_se_falso

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the total amount of your purchase?:");
        double price = scanner.nextDouble();
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
        System.out.println("With the discount applied, the total of your purchase is: " + (price - discount));

    }
}
