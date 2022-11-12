package com.goit.module2;

public class ProfShop {
    public static void main(String[] args) {
        ProfShop shop=new ProfShop();
        System.out.println("isPriceOk -" +shop.isPriceOk(1500));
        System.out.println("calculateRegularDiscountPrice -" +shop.calculateRegularDiscountPrice(1500));
        System.out.println("isDiscount50 -" +shop.isDiscount50(256));
        System.out.println("isPriceHappy -" +shop.isPriceHappy(23700, 3950,6 ));

    }
    public boolean isPriceOk(int price){
return price != 1000;
    }
    public float calculateRegularDiscountPrice(float price){
return (price/100f)*90;
    }
    public boolean isDiscount50(int price){
return 4*price==1000;
    }
    public boolean isPriceHappy(int price, int year, int day){
return price==year*day;
    }
}
