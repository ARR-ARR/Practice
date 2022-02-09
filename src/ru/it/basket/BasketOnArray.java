package ru.it.basket;

import ru.it.retail.Product;

public class BasketOnArray implements Basket {


    private int indexBasket;

    private int indexArrayReg;

    private Product[] products = new Product[10];

    public void addProduct(Product whiskey) {
        if(indexArrayReg >= 10) {
            Product[] products1 = new Product[products.length+10];
            System.arraycopy(products, 0,products1, 0, products.length);
            products = products1;
            indexArrayReg = 0;
        }

        products[indexBasket++] = whiskey;
        indexArrayReg++;
    }

    public Product[] getProducts() {
        return products;
    }
}
