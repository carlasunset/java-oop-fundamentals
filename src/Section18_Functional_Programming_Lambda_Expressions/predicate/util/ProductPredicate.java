package Section18_Functional_Programming_Lambda_Expressions.predicate.util;

import Section18_Functional_Programming_Lambda_Expressions.predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
