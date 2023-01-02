package com.goit.module7;

public class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

class DigitText {
    public boolean detect(String text) {

//        String[] findWords = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " "};
        char[] line = text.toCharArray();


//        Character.isDigit()

        for (char c : line) {
            boolean digit = isDigit(c);
            if (!digit) {
                return  false;
            }
        }
        return true;
    }

    private boolean isDigit (char c){
        char[] findWords = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' '};
        for (char findWord : findWords) {
            if (c==findWord){
                return true;
            }
        }
        return false;
    }

}
