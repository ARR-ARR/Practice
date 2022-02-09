package ru.it.basket;

import ru.it.retail.Product;

import java.util.Collection;
import java.util.HashSet;

public class BasketOnSet implements Basket{

    private Collection<Product> products = new HashSet<>();
    @Override
    public void addProduct(Product p) {
        products.add(p);

    }

    @Override
    public Product[] getProducts() {
        return new Product[0];
    }
}
