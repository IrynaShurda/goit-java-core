package com.goit.module7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
//        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
//        System.out.println(freqCounter.countFreq("Hello World", "java"));

        System.out.println(freqCounter.countFreq("fysauppeexi gifa Jugyunognu goq figuewvyun", "Jugyunognu" ));
    }
}

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] words = phrase.toLowerCase().split(" ");
        float countWord = 0;
        float resultCountWord;
        float lengthWord;
        for (String symbol : words) {
            if (symbol.equals(word.toLowerCase())) {
                countWord++;
            }
        }
        lengthWord=words.length;
         resultCountWord=countWord/lengthWord;
        System.out.println(Arrays.toString(words));
        return resultCountWord;
    }
}
