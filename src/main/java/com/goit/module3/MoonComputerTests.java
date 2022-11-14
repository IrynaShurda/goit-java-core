package com.goit.module3;

import java.util.Scanner;

public class MoonComputerTests {
// Завдання 1
// Test output on Hello Java standard input
    /*public static void main(String[] args) {
       MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicInputOutput();
    }*/

//Завдання 2
// Test output on 24, 4 standard input
    /*public static void main(String[] args) {
        new MoonComputerTests().testMath();
    }*/

//Завдання №3
// Test output on true, true, false standard input
   public static void main(String[] args) {
        new MoonComputerTests().testLogicalOperators();
    }

//Завдання 1
 /*   public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text);
        scanner.close();
    }*/

//Завдання 2
    /* public void testMath(){
        Scanner scanner = new Scanner(System.in);
        int numeric1 = scanner.nextInt();
        int numeric2 = scanner.nextInt();
        System.out.println((numeric1+numeric2) + " "
                + (numeric1-numeric2) + " "
                + (numeric1*numeric2) + " "
                + (numeric1/numeric2));
        scanner.close();
    }*/

    //Завдання №3
    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        scanner.close();
        System.out.println((a && b && c) + " " + (a || b || c));
    }
}
