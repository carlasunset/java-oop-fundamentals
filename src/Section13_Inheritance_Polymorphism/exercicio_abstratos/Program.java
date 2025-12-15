package Section13_Inheritance_Polymorphism.exercicio_abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<TaxPayer> taxPayersList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Invidual or company (i/c)? ");
            char answer = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();

            switch (answer) {
                case 'i' -> {
                    System.out.println("Health expenditures: ");
                    double healthExpenditures = scanner.nextDouble();
                    taxPayersList.add(new Individual(name, anualIncome, healthExpenditures));
                }
                case 'c' -> {
                    System.out.print("Number of employees: ");
                    int employees = scanner.nextInt();
                    taxPayersList.add(new Company(name, anualIncome, employees));
                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        }

        System.out.println("Taxes Paids: ");
        for (TaxPayer taxPayers : taxPayersList){
            System.out.println(taxPayers.getName() + ": $ " + String.format("%.2f", taxPayers.tax()));
        }
    }
}
