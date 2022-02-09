package ru.it;


import ru.it.basket.Basket;
import ru.it.basket.BasketOnArray;
import ru.it.retail.Beer;
import ru.it.retail.Product;
import ru.it.retail.Whiskey;


import java.util.Random;

public class  RetailRunApp {

    public static void main(String[] args) {

        Basket myBasket = new BasketOnArray();

        for (int i = 0; i < 100; i++) {
            Product whiskey = new Whiskey();
            myBasket.addProduct(selectAnyProduct());
        }

        for(int i = 0; i < myBasket.getProducts().length; i++){
            System.out.println("Index: " + i + ", Продукт: " + myBasket.getProducts()[i]);
        }

    }

    private static Product selectAnyProduct() {
        Random r = new Random();
        int i = r.nextInt(100);
        if(i % 2 == 0){
            return new Whiskey();
        }
        return new Beer("1", "1", "1");
    }


}
