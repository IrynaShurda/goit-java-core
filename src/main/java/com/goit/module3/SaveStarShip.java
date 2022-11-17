package com.goit.module3;

import java.util.Arrays;

public class SaveStarShip {
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
        System.out.println(ship.choosePlanet(10));
        System.out.println(ship.calculateFuelPrice("STAR100", 10));
    }

    public int calculateDistance(int distance){
        if (distance > 0) {
            return distance;
        } else {
            return Math.abs(distance);
        }
    }

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

    public String choosePlanet(long distanceToEarth){
        if (distanceToEarth < 45677) {
            return "Earth";
        }else{
            return "Pern";
        }
    }
    public int calculateFuelPrice(String fuel, int count){
        if (fuel.equals("STAR100")){
            return count*70;
        } else if (fuel.equals("STAR500")){
            return count*120;
        } else if (fuel.equals("STAR1000")){
            return count*200;
        }else {
            return count*50;
        }
    }
}
