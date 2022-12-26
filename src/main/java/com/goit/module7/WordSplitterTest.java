package com.goit.module7;

import java.util.Arrays;

public class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

class WordSplitter {
    public String[] split(String phrase) {
        String[] words = phrase.split(" ");
        int countLengthNewArray = 0;
        for (String word : words) {
            if (word.length() > 0) {
                countLengthNewArray++;
            }
        }
        String[] parseWord = new String[countLengthNewArray];
        int countParseWordArray = 0;
        for (String word : words) {
            if (word.length() > 0) {
                parseWord[countParseWordArray] = word.toLowerCase();
                countParseWordArray++;
            }
        }
        return parseWord;
    }
}
