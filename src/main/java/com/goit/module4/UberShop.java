package com.goit.module4;

import java.util.Arrays;

public class UberShop {
    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        // Завдання 1
        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        /*float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
        */

        // Завдання 2
        //Should be [200, 2250]
        /*float[] prices = new float[]{100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
         */

        // Завдання 3
        //Should be [50, 1500]
        //int[] prices = new int[]{100, 1500, 300, 50};
        //int[] prices = new int[]{49, 49, 49, 49};
        int[] prices = new int[]{};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }
    // Завдання 1
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

    // Завдання 2
    /*public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000f) {
                prices[i]=prices[i] * 2;
            } else {
                prices[i]=prices[i] * 1.5f;
            }
        }
    }*/

    // Завдання 3
    public int[] findMinMaxPrices(int[] prices) {
        Arrays.sort(prices);
        int lenMass = prices.length;
        /*if (prices.length >= 2) {
            int[] minMax = {prices[0], prices[prices.length - 1]};
            return minMax;
        } else if (prices[0]==prices[prices.length - 1]) {
            int[] minMax ={prices[0]};
            return minMax;
        } else if (prices.length == 1) {
            int[] minMax ={prices[0]};
            return minMax;
        } else {
            int[] minMax = new int[0];
            return minMax;
        }*/
        if (lenMass == 0) {
            return new int[0];
        } else if (prices[0] == prices[lenMass - 1]) {
           return new int[]{prices[0]};
        } else if (lenMass >= 2) {
           return new int[]{prices[0], prices[lenMass - 1]};
        } else if (lenMass == 1) {
            return new int[]{prices[0]};
        } else
            return new int[0];
    }
}
