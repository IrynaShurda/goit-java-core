package com.goit.module7;

public class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        char[] wordsTarget = targetWord.toLowerCase().toCharArray();
        for (char c : wordsTarget) {
            boolean result = isTarget(c, sourceWord);
            if (!result) {
                return false;
            }
        }
        return true;
    }

    private boolean isTarget(char c, String sourceWord) {
        char[] wordsSource = sourceWord.toLowerCase().toCharArray();
        for (char c1 : wordsSource) {
            if (c == c1) {
                return true;
            }
        }
        return false;
    }
}
