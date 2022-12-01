package com.goit.module4;

public class TrurlBank {
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }

    public int sumQuads(int n) {
        int number = 1;
        int sum = 0;
        while (number <= n) {
            sum += Math.pow(number, 2);
            number++;
        }
        return sum;
    }

    public int countSumOfDigits(int number) {
        String stringNumber = Integer.toString(number);
        char[] toCharArray = stringNumber.toCharArray();
        int counter = 0;
        int sum = 0;
        while (counter < toCharArray.length) {
            // Integer.parseInt(String.valueOf(toCharArray[counter]));
            // int element = toCharArray[counter];
            // sum += element;
            sum += Character.getNumericValue(toCharArray[counter]);
         //   sum += Integer.parseInt(Character.toString(stringNumber.charAt(counter)));
            counter++;
        }
        return sum;
    }
}

