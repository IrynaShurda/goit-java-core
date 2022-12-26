package com.goit.module7;

import java.util.Arrays;

public class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter {
    public int count(String phrase) {
        int counter = 0;
        char[] symbols = {'.', ',', '!', ':', ';'};
        char[] line = phrase.toCharArray();
        for (char symbol : symbols) {
            for (char textChar : line) {
                if (symbol == textChar) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
