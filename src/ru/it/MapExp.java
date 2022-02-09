package ru.it;

import ru.it.retail.Beer;
import java.util.HashMap;
import java.util.Map;


public class MapExp {

    public static void main(String[] args) {
     Map<Integer, Beer> map = new HashMap<>();

     populaWrProduct(map);

     printMap(map);



    }

    private static void printMap(Map<Integer, Beer> map) {
        System.out.println(map.get(75433653) + "\n" + map.get(-1683455624) + "\n" + map.get(790675678));
    }

    private static void populaWrProduct(Map<Integer, Beer> myMap) {
        Beer leff = new Beer("Leff", "F123", "Belgium");
        Beer budweiser = new Beer("Budweiser", "F343", "USA");
        Beer amstel = new Beer("Amstel", "F589", "Netherlands");
        myMap.put(leff.hashCode(), leff);
        myMap.put(budweiser.hashCode(), budweiser);
        myMap.put(amstel.hashCode(), amstel);



    }



}
