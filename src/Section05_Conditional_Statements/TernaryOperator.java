package Section05_Conditional_Statements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        // (condition to be tested) ? value_if_true : value_if_false

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the total amount of your purchase?:");
        double price = scanner.nextDouble();
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
        System.out.println("With the discount applied, the total of your purchase is: " + (price - discount));

    }
}
