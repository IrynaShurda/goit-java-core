package com.goit.module2;

public class MarsCalculator {

    public static void main(String[] args) {
        MarsCalculator calculator = new MarsCalculator();
        System.out.println("sum(a, b, c) = " + calculator.sum(1, 2,3));
        System.out.println("sub(a, b, c) = " + calculator.sub(1, 2,3));
        System.out.println("multiply(a, b, c) = " + calculator.multiply(1, 2,3));
        System.out.println("divide(a, b, c) = " + calculator.divide(1, 2,3));
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public int sub(int a, int b, int c){
        return a-(b+c);
    }
    public int multiply(int a, int b, int c){
return sum(a, b, c) * sub (a, b, c);
    }
    public float divide(int a, int b, int c){
return sum(a, b, c)/10f;
    }
}
