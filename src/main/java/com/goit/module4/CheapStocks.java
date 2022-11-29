package com.goit.module4;

import java.util.Arrays;

public class CheapStocks {
    public static void main(String[] args) {
        CheapStocks stocksChap = new CheapStocks();
        String[] stocks = {"gun 500", "firebow 70", "pixboom 200","pixboom2 190"};
        System.out.println(stocksChap.getCheapStocks(stocks));

        //System.out.println("strings = " + Arrays.toString(strings));
        //System.out.println("stock = " + stock);
    }

    public String getCheapStocks(String[] stocks) {
        String variableForStrings="".trim();
        for (String stock : stocks) {
            String[] strings = stock.split(" ");
            int stocksPrie = Integer.parseInt(strings[1]);
            if (stocksPrie < 200) {
                variableForStrings = variableForStrings + " " + strings[0];
            }
        }
        return variableForStrings;
    }
}
