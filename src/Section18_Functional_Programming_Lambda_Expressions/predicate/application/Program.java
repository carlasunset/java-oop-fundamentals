package Section18_Functional_Programming_Lambda_Expressions.predicate.application;

import Section18_Functional_Programming_Lambda_Expressions.predicate.entities.Product;
import Section18_Functional_Programming_Lambda_Expressions.predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.50));
        productList.add(new Product("HD Case", 80.90));

        productList.removeIf(product -> product.getPrice() >= 100.00);

        for (Product p : productList){
            System.out.println(p);
        }

    }
}
