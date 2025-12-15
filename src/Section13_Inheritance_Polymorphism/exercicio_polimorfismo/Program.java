package Section13_Inheritance_Polymorphism.exercicio_polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Product> productsList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char answer = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            switch (answer) {
                case 'c' -> {
                    productsList.add(new Product(name, price));
                }
                case 'i' -> {
                    System.out.print("Customs Fee: ");
                    double customsFee = scanner.nextDouble();
                    productsList.add(new ImportedProduct(name, price, customsFee));
                }
                case 'u' -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    productsList.add(new UsedProduct(name, price, date));
                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : productsList){
            System.out.println(product.priceTag());
        }

    }

}
