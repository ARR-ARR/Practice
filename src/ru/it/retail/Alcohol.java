package ru.it.retail;

import ru.it.retail.Product;

public abstract class Alcohol extends Product {

    private String typePack;
    private String volume;

    public Alcohol(){}

    public Alcohol(String name){
        super(name);
    }

    @Override
    void putInTheBasket() {

    }

    @Override
    void outOfTheBasket() {

    }
}
