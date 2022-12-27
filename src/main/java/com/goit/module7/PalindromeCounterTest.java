package com.goit.module7;

import java.util.Arrays;

public class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter {
    public int count(String phrase) {
        String[] words = phrase.toLowerCase().split(" ");
        int counter = 0;
        for (String word : words) {
            StringBuilder result = new StringBuilder(word);
            String reverse = result.reverse().toString();
            if (word.equals(reverse)) {
                counter++;
            }
        }
        return counter;
    }
}
