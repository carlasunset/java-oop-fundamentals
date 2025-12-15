package Secao08_IntroOrientadoObjetos.exercicios.funcionario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        double grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        double tax = scanner.nextDouble();

        Employee emp = new Employee(name, grossSalary, tax);
        System.out.println("Employee: " + emp.getName() + ", " + emp.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Upated data: " + emp.getName() + ", " + emp.netSalary());

        scanner.close();
    }
}
