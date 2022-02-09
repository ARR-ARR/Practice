package ru.it.basket;

import ru.it.retail.Product;

import java.util.ArrayList;
import java.util.Collection;

public class BasketOnList implements Basket{

    private Collection<Product> products = new ArrayList<>();


    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public Product[] getProducts() {
        return (Product[])products.toArray();
    }
}
