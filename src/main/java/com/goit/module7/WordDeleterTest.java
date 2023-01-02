package com.goit.module7;

public class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
        System.out.println(wordDeleter.remove("coe lutoekj vys tyxixuy yhypno potou ibfe",
                new String[]{"vys", "yhypno", "ibfe", "potou", "coe"}));
    }
}

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] phraseArr = phrase.split(" ");
        StringBuilder newPhrase = new StringBuilder();


        for (String line : phraseArr) {
            boolean result = findEquals(line, words);
                if (!result) {
                    newPhrase.append(line).append(" ");
                }
        }
        return newPhrase.toString().trim();
    }

    private boolean findEquals(String line,String[] words ) {
        for (String word : words) {
            if (line.equals(word)) {
                return true;
            }
        }
        return false;
    }
}