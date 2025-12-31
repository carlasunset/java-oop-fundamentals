package Section06_Loop_Statements;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char answer;
        do {
            System.out.print("Type the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double F = 9.0 * celsius / 5.0 + 32.0;
            System.out.println("Temperature in Fahrenheit: " + F);

            System.out.println("Would you like to repeat this procedure?: ");
            answer = scanner.next().charAt(0);
        } while (answer != 'n');
        scanner.close();
    }
}
