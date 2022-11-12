package com.goit.module2;

class ScoreCounter {
    public int addScore(int currentScore, int amount) {
        currentScore += amount;
        return currentScore;
    }
    public int twiceScore(int currentScore){
        return currentScore*=2;
    }
    //Expected output
    public static void main(String[] args) {
        ScoreCounter counter = new ScoreCounter();
        System.out.println("addScore(10, 5) = " + counter.addScore(10, 5)); //Should be 15
        System.out.println("twiceScore(7) = " + counter.twiceScore(7)); //Should be 14
    }
}
