package ru.it.retail;

import ru.it.retail.Alcohol;

import java.util.Map;
import java.util.Objects;

public class Beer extends Alcohol {

    private String codeBeer;
    private String manufacturer;

    public Beer() {

    }

    public Beer(String name,String codeBeer, String manufacturer) {
        super(name);
        this.codeBeer = codeBeer;
        this.manufacturer = manufacturer;
    }

    @Override
    public void putInTheBasket() {
        super.putInTheBasket();
    }

    @Override
    public void outOfTheBasket() {
        super.outOfTheBasket();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Beer beer = (Beer) o;
        return Objects.equals(codeBeer, beer.codeBeer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codeBeer);
    }

    @Override
    public String toString() {
        return "Beer " + getName() +
                " codeBeer '" + codeBeer + '\'' +
                ", manufacturer '" + manufacturer + '\'';
    }

    public static void populaWrProduct(Map<Integer, Beer> myMap) {
        Beer leff = new Beer("Leff", "F123", "Belgium");
        Beer budweiser = new Beer("Budweiser", "F343", "USA");
        Beer amstel = new Beer("Amstel", "F589", "Netherlands");
        myMap.put(leff.hashCode(), leff);
        myMap.put(budweiser.hashCode(), budweiser);
        myMap.put(amstel.hashCode(), amstel);

    }


}
