package com.goit.module7;

public class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter{
    public int count(String phrase){
        char[] line = phrase.toCharArray();
        String uniqueSymbols="";
        for (char c : line) {
            if (!uniqueSymbols.contains(String.valueOf(c))){
                uniqueSymbols+=c;
            }
        }
        System.out.println(uniqueSymbols);
        return uniqueSymbols.length();
    }
}
