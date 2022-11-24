package com.goit.module4;

import java.util.Arrays;

public class UberShop {
    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup." );
        }

        System.out.println("fori");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]+ " jup." );
        }

        System.out.println("forr");
        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.println(prices[i]+ " jup." );
        }

       for (int i=0;i<prices.length;++i){
            System.out.println(prices[i]+ " jup." );
        }
    }
}
