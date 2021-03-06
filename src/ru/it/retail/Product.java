package ru.it.retail;

import java.util.Objects;

public abstract class Product {

    private String name;
    private double weight;

    abstract void putInTheBasket();
    abstract void outOfTheBasket();

    public Product(String name) {
        this.name = name;
    }

    public Product() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
