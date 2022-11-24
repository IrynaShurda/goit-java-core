package com.goit.module4;

import java.util.Arrays;

public class UberShop {
    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        /*float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);*/

        //Should be [200, 2250]
        float[] prices = new float[]{100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }

    /*public void printPrices(float[] prices) {
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
        }*/
    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            //float newPrices;
            if (prices[i] < 1000f) {
                //System.out.println(prices[i] * 2);
                prices[i]=prices[i] * 2;
            } else {
                //System.out.println(prices[i] * 1.5);
                prices[i]=prices[i] * 1.5f;
            }
        }
    }
}
