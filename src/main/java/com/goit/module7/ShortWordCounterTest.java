package com.goit.module7;

public class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
class ShortWordCounter{
    public int count(String phrase, int minLength){
        String[] words = phrase.toLowerCase().split(" ");
        int countWord = 0;
        for (String symbol : words) {
           if (symbol.length()<= minLength){
               countWord++;
           }
        }
        return countWord;
    }
}
