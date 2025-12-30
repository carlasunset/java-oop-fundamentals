package Section18_Functional_Programming_Lambda_Expressions.demo.application;

import Section18_Functional_Programming_Lambda_Expressions.demo.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Laptop", 1200.00));
        productList.add(new Product("Tablet", 450.00));

        Collections.sort(productList);

        for(Product p : productList){
            System.out.println(p);
        }
    }
}
