package com.goit.module4;

public class TrurlBank {
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }

    public int sumQuads(int n) {
            int number = 1;
            int sum=0;
            while (number<=n){
                sum +=Math.pow(number, 2);
                number++;
            }
                return sum;
    }
}
