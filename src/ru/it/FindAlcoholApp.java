package ru.it;

import ru.it.retail.Alcohol;
import ru.it.retail.Whiskey;


import java.util.*;


public class FindAlcoholApp {

    public static void main(String[] args) {

        Collection<Alcohol> collection = populateCollection();

        System.out.println(new Whiskey("Виски Пряный").hashCode());


        //printCollection(collection);




    }




    private static Collection<Alcohol> populateCollection() {


        Set<Alcohol> set = new HashSet<>();
        for (int i = 0; i < 70; i++) {
            if (i != 50)
                set.add(new Whiskey("Виски Яблоко"));
        }
        return set;
    }



}
