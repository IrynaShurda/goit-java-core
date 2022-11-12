package com.goit.module2;

public class MarsValueConverter {
    public static void main(String[] args) {
        MarsValueConverter valueConverter= new MarsValueConverter();
        System.out.println("changeMoneyAmount  "
                + valueConverter.changeMoneyAmount(100f, 40.5f));
        System.out.println("calculateMoneySum  " + valueConverter.calculateMoneySum(50, 40));
        System.out.println("halfOfMoney  " + valueConverter.halfOfMoney(1000.9999));
    }
    public int changeMoneyAmount(float startAmount, float toRemove){
return (int) (startAmount-toRemove);
    }
    public byte calculateMoneySum(int sum1, int sum2){
return (byte) (sum1+sum2);
    }
    public short halfOfMoney(double startMoney){
return (short) ((short) startMoney/2d);
    }
}
