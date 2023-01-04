package com.goit.module7;

public class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter {
    public int count(String text) {
        String[] words = text.split(" ");
        int counter = 0;
        for (String word : words) {
            if (!Character.isLowerCase(word.charAt(0)) && word.length() > 1 && isFindSmall(word)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isFindSmall(String word) {
        char[] letters = word.toCharArray();
        for (int i = 1; i < letters.length; i++) {
            if (Character.isLowerCase(letters[i])) {
                return true;
            }
        }
        return false;
    }
}
