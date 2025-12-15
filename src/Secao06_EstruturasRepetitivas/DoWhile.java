package Secao06_EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char resposta;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double F = 9.0 * celsius / 5.0 + 32.0;
            System.out.println("Temperatura em Fahrenheit: " + F);

            System.out.println("Gostaria de repetir o processo?: ");
            resposta = scanner.next().charAt(0);
        } while (resposta != 'n');
        scanner.close();
    }
}
