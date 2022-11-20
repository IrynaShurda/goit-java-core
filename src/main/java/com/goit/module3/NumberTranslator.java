package com.goit.module3;

public class NumberTranslator {
    public static void main(String[] args) {
        NumberTranslator numberTranslator = new NumberTranslator();
        System.out.println(numberTranslator.translate(" X I"));
        System.out.println(numberTranslator.translate("iX "));
        System.out.println(numberTranslator.translate("XX"));
    }

    public int translate(String romanNumber) {
        int newNumber;
        switch (romanNumber.trim().toUpperCase()) {
            case "I":
                newNumber = 1;
                break;
            case "II":
                newNumber = 2;
                break;
            case "III":
                newNumber = 3;
                break;
            case "IV":
                newNumber = 4;
                break;
            case "V":
                newNumber = 5;
                break;
            case "VI":
                newNumber = 6;
                break;
            case "VII":
                newNumber = 7;
                break;
            case "IIX":
                newNumber = 8;
                break;
            case "IX":
                newNumber = 9;
                break;
            case "X":
                newNumber = 10;
                break;
            case "XI":
                newNumber = 11;
                break;
            case "XII":
                newNumber = 12;
                break;
            default:
                newNumber = -1;
        }
        return newNumber;
    }
}
