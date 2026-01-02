package Section18_Streams.exercise.application;

import Section18_Streams.exercise.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Employee> employeeList = new ArrayList<>();
            String line = bufferedReader.readLine();

            while (line != null){
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            System.out.print("Enter salary to filter: ");
            double factor = scanner.nextDouble();

            List<String> employeeEmails = employeeList.stream()
                    .filter(employee -> employee.getSalary() > factor)
                    .map(employee -> employee.getEmail())
                    .sorted().toList();

            System.out.println("Email of people whose salary is more than " +  String.format("%.2f", factor) + ": ");
            employeeEmails.forEach(System.out::println);

            double sum = employeeList.stream()
                    .filter(employee -> employee.getName().startsWith("M"))
                    .mapToDouble(Employee::getSalary)
                    .sum();

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        scanner.close();
    }
}
