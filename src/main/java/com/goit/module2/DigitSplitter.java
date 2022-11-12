package com.goit.module2;

public class DigitSplitter {
    public static void main(String[] args) {
        DigitSplitter splitter=new DigitSplitter();
        System.out.println("getFirstDigit  " + splitter.getFirstDigit(15));
        System.out.println("getSecondDigit  " + splitter.getSecondDigit(15));
    }
    public int getFirstDigit(int number){
return number/10;
    }
    public int getSecondDigit(int number){
return number % 10;
    }
}
