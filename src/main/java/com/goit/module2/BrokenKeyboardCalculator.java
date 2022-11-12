package com.goit.module2;

public class BrokenKeyboardCalculator {
    public static void main(String[] args) {
        BrokenKeyboardCalculator calculator=new BrokenKeyboardCalculator();
        System.out.println("add = " + calculator.add(5, 3));
        System.out.println("sub = " + calculator.sub(8, 7));
        System.out.println("multiply = " + calculator.multiply(1, 100));
        System.out.println("divide = " + calculator.divide(8, 4));

    }
    public int add(int a, int b){
return a+=b;
    }
    public int sub(int a, int b){
return a-=b;
    }
    public int multiply(int a, int b){
return a*=b;
    }
    public int divide(int a, int b){
return a/=b;
    }
}
