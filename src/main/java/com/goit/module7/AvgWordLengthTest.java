package com.goit.module7;

public class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {
    public double count(String phrase) {
        String[] phraseWords = phrase.split(" ");
        double wordLength = 0;
        for (String word : phraseWords) {
            wordLength += word.length();
        }
        return wordLength / phraseWords.length;
    }
}
