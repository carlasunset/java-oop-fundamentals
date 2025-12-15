package Section14_Exception_Handling.exercicio.application;

import Section14_Exception_Handling.exercicio.model.entities.Account;
import Section14_Exception_Handling.exercicio.model.exception.BusinessException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter the amount for withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
            System.out.print("New balance: " + account.getBalance());
        }
        catch (BusinessException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        scanner.close();
    }
}