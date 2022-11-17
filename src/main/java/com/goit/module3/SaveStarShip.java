package com.goit.module3;

public class SaveStarShip {
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
    public int calculateDistance(int distance){
        if (distance > 0) {
            return distance;
        } else {
            return Math.abs(distance);
        }
    }
}
