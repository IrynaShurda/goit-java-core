package com.goit.module7;

public class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}

class WaterCounter {
    public double count(String text) {
        char[] letters = text.toCharArray();
        double countSpase = 0;
        for (char letter : letters) {
            if (letter == ' ') {
                countSpase++;
            }
        }
        return countSpase / letters.length;
    }
}
