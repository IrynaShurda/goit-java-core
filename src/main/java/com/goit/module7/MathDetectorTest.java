package com.goit.module7;

public class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

class MathDetector {
    public boolean isMath(String text) {
        int counter = 0;
        char[] line = text.toCharArray();
        for (char c : line) {
            if (isDigit(c)) {
                counter++;
            }
            if (counter >= 2) {
                return true;
            }
            boolean digit = isDigit(c) || isMathOperator(c);
            if (!digit) {
                return false;
            }
        }
        return true;
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


    private boolean isMathOperator(char c) {
        char[] findWords = {'+', '-', '*', '/', '='};
        for (char findWord : findWords) {
            if (c == findWord) {
                return true;
            }
        }
        return false;
    }
}
