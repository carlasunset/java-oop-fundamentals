package Section09_Constructors_This_Overloading_Encapsulation.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Is there an initial deposit? (y/n): ");
        char answer = scanner.next().charAt(0);
        double balance = 0.0;
        if(answer == 'y'){
            System.out.print("Enter initial deposit value: ");
            balance = scanner.nextDouble();
        }
        Account account = new Account(number, holder, balance);

        System.out.println("Account data: " + account);

        System.out.print("Enter a deposit value: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data: " + account);

        System.out.print("Enter a withdraw value: ");
        amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data: " + account);

        scanner.close();
    }
}
