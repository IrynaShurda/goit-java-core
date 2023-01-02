package com.goit.module7;

import java.util.Arrays;

public class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {
    public int[] extract(String text) {
        char[] line = text.toCharArray();
        int i = 0;
        for (char c : line) {
            if (isDigit(c)) {
                i++;
            }
        }
        int[] digit = new int[i];
        int j = 0;
        for (char c : line) {
            if (isDigit(c)) {
                digit[j] = Character.getNumericValue(c);
                j++;
            }
        }
        return digit;
    }

    private boolean isDigit(char c) {
        char[] findWords = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (char findWord : findWords) {
            if (c == findWord) {
                return true;
            }
        }
        return false;
    }
}
