package com.goit.module3;

import java.util.Arrays;

public class SaveStarShip {
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Завдання 15
        //System.out.println(ship.calculateDistance(-10));

        //Завдання 16
        System.out.println(Arrays.toString(ship.getPlanets
                ("DangerBanger")));

    }

    //Завдання 15
    /*public int calculateDistance(int distance){
        if (distance > 0) {
            return distance;
        } else {
            return Math.abs(distance);
        }
    }*/
    //Завдання 16
    public String[] getPlanets(String galaxy) {
        String[] miaru = {"Maux", "Reux", "Piax"};
        String[] milkyway = {"Earth", "Mars", "Jupiter"};
        String[] dangerBanger = {"Fobius", "Demius"};
        String[] empty = {};
        if (galaxy.equals("Miaru")) {
            return miaru;
        } else if (galaxy.equals("Milkyway")) {
            return milkyway;
        } else if (galaxy.equals("DangerBanger")) {
            return dangerBanger;
        } else {
            return empty;
        }
    }
}
