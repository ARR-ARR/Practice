package ru.it.basket;

import ru.it.retail.Product;

public interface Basket {

    void addProduct(Product whiskey);
    Product[] getProducts();


}
