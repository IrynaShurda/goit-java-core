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

        /*int[] prices = new int[]{100, 1500, 300, 50};
        //int[] prices = new int[]{49, 49, 49, 49};
        //int[] prices = new int[]{};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));*/

        // Завдання 4
        //Should be [50, 1500]
        /*int[] prices = new int[]{100, 1500, 300, 50, 10, 10, 70};
        System.out.println(shop.getMinPriceCount(prices)); //Should be 2 */

        // Завдання 5
        //Should be [150, 200]
        /*//int[] prices = new int[]{150, 100, 200};
        int[] prices = new int[]{100, 100, 100};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
         */

        // Завдання 6
        //Should be [1599, 399]
        /*
        //int[] prices = new int[]{399, 1599, 399, 50, 10, 10, 70};
        //int[] prices = new int[]{99, 37, 9, 42, 69, 35, 19, 52, 89, 13};
        int[] prices = new int[]{49, 79, 29, 14, 59, 72, 29, 71, 19, 18};
        System.out.println(Arrays.toString(shop.leavePrice9(prices)));*/

        // Завдання 7
        //Final result should be ["gun", "firebow", "firegun"]
        /*//String[] showcaseStocks = new String[]{"gun", "firebow"};
        String[] showcaseStocks = new String[]{"Ypa", "Onzibew", "bijyma", "tae", "mazaawza"};
        //String[] warehouseStocks = new String[]{"firegun"};
        String[] warehouseStocks = new String[]{"bedyuv", "Hihor", "Ybydlou", "etvuac", "Mei"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));*/

        // Завдання 8
        //Should be 144 - 20 + 50 + 40 + 34
        //int[] prices = new int[]{10, 20, 50, 40, 34, 500};
        int[] prices = new int[]{22, 29, 88, 20, 48, 32, 91, 11, 10, 64, 91, 73, 82, 50};
        //System.out.println(shop.getPricesSum(prices, 20, 50));
        System.out.println(shop.getPricesSum(prices, 16, 73));
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
    /*public int[] findMinMaxPrices(int[] prices) {
        Arrays.sort(prices);
        int lenMass = prices.length;
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

    }*/

    // Завдання 4
    /*public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int counter = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }
        for (int minPrice : prices) {
            if (min == minPrice) {
                counter = counter + 1;
            }
        }
        return counter;
    }*/

    // Завдання 5
    /*public int[] removePrice(int[] prices, int toRemove) {
        int countToRemove = 0;
        for (int price : prices) {
            if (price == toRemove) {
                countToRemove++;
                System.out.println(countToRemove);
            }
        }
        int[] newPrices = new int[prices.length - countToRemove];
        int countNewPricesArray = 0;
        for (int price : prices) {
            if (price != toRemove) {
                newPrices[countNewPricesArray] = price;
                countNewPricesArray++;
            }
        }
        return newPrices;
    } */
    // Завдання 6
    /*public int[] leavePrice9(int[] prices) {
        int countLengthNewArray = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                countLengthNewArray++;
            }
        }
        int[] newPrice = new int[countLengthNewArray];
        int countNewPricesArray = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                newPrice[countNewPricesArray] = price;
                countNewPricesArray++;
            }
        }
        return newPrice;
    }*/

    // Завдання 7
    /*public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        int indexNewArray = showcaseStocks.length + warehouseStocks.length;
        String[] newArray = new String[indexNewArray];
        int i = 0;
        for (; i < showcaseStocks.length; i++) {
            newArray[i] = showcaseStocks[i];
        }
        int index = i;
        for (String warehouseStock : warehouseStocks) {
            newArray[index] = warehouseStock;
            index++;
        }
        return newArray;
    }*/

    // Завдання 8
    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        //int min = prices[0];
        int addPrice = 0;
        for (int price : prices) {
            if (price <= maxPrice && price >= minPrice) {
                addPrice = price + addPrice;
            }
        }
        return addPrice;
    }
}

