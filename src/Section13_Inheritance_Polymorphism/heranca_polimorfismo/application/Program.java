package Section13_Inheritance_Polymorphism.heranca_polimorfismo.application;

import Section13_Inheritance_Polymorphism.heranca_polimorfismo.entities.Account;
import Section13_Inheritance_Polymorphism.heranca_polimorfismo.entities.BusinessAccount;
import Section13_Inheritance_Polymorphism.heranca_polimorfismo.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        BusinessAccount businessAccount = new BusinessAccount(1002,"Maria", 0.0, 500.0);


        //UPCASTING

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING

        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        //BusinessAccount account5 = (BusinessAccount) account3;

        if(account3 instanceof BusinessAccount){
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }

        if(account3 instanceof SavingsAccount){
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }
        //Testando sobrescrita do metodo withdraw nas subclasses SavingsAccount e BusinessAccount
        //Intro ao polimorfismo

        Account account7 = new SavingsAccount(1007, "Carlos", 1000.0, 0.01);
        account7.withdraw(200.0); //metodo sobrescrito na classe SavingsAccount e não possui a taxa de 5.0
        System.out.println(account7.getBalance());

        Account account8 = new BusinessAccount(1008, "Vitor", 1000.0, 200.0);
        account8.withdraw(200.0);
        System.out.println(account8.getBalance());


        List<Account> listAccounts = new ArrayList<>();
        listAccounts.add(new SavingsAccount(1009, "Carlos", 500.0, 0.01));
        listAccounts.add(new BusinessAccount(1010, "Vitor", 1000.0, 400.0));
        listAccounts.add(new SavingsAccount(1011, "João", 300.0, 0.01));
        listAccounts.add(new BusinessAccount(1012, "Maria", 500.0, 500.0));

        double sum = 0;
        for (Account account: listAccounts){
            sum += account.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account account: listAccounts){
            account.deposit(10.0);
        }

        for (Account account: listAccounts){
            System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber(), account.getBalance());
        }

    }
}
