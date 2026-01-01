package Section18_Functional_Programming_Lambda_Expressions.consumer.util;

import Section18_Functional_Programming_Lambda_Expressions.consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
