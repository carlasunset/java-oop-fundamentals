package Secao10_ComportamentoDeMemoria_Arrays_Listas.vetores.application;

import Secao10_ComportamentoDeMemoria_Arrays_Listas.vetores.entitites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos produtos quer cadastrar: ");
        int n = scanner.nextInt();
        Product[] vectProduct = new Product[n];

        for(int i=0; i < vectProduct.length; i++){
            System.out.print("Nome: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Preço: ");
            double price = scanner.nextDouble();
            vectProduct[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (Product product : vectProduct) {
            sum += product.getPrice();
        }

        double avg  = sum / vectProduct.length;
        System.out.printf("Média dos preços dos produtos: %.2f%n" , avg);

        scanner.close();
    }
}
