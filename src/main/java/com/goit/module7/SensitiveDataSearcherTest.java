package com.goit.module7;

public class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        String[] sensitiveWords = {"pass", "key", "login", "email"};
        for (String word : sensitiveWords) {
            if (phrase.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}
