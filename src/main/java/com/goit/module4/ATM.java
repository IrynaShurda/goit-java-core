package com.goit.module4;

public class ATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(578));
    }

    public int countBanknotes(int sum) {
        int[] nominals = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int counter = 0;
        int divSum;
        int result = 0;

        while (counter < nominals.length) {
            int nominal = nominals[counter];
            if (sum >= nominal) {
                divSum = sum / nominal;
                result += divSum;
                sum = sum - nominal * divSum;
            }
            counter++;
        }
        return result;
    }
}

