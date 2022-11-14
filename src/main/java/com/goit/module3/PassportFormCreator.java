package com.goit.module3;


//import java.util.Locale;
import java.util.Scanner;

public class PassportFormCreator {
    public static void main(String[] args) {
        PassportFormCreator passport = new PassportFormCreator();
        passport.createForms();
    }

    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String textName = scanner.next();
        String textSname = scanner.next();
        int age = scanner.nextInt();
        scanner.close();
        System.out.println(textName + " " + textSname + " " + age * 10);
        System.out.println(textName.toUpperCase()
                + "\n" + textSname.toUpperCase() + "\n" + age * 10);
    }
}
