package com.goit.module3;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
        System.out.println(ship.choosePlanet(10));
        System.out.println(ship.calculateFuelPrice("STAR100", 10));
        System.out.println(ship.roundSpeed(75));
        System.out.println(ship.calculateNeededFuel(21));
        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();
        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));
    }

    public int calculateDistance(int distance) {
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

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        if (fuel.equals("STAR100")) {
            return count * 70;
        } else if (fuel.equals("STAR500")) {
            return count * 120;
        } else if (fuel.equals("STAR1000")) {
            return count * 200;
        } else {
            return count * 50;
        }
    }

    public int roundSpeed(int speed) {
        if (speed % 10 == 0) {
            return speed;
        } else if (speed % 10 >= 5) {
            return (speed - (speed % 10)) + 10;
        } else {
            return (speed - (speed % 10));
        }
    }

    public int calculateNeededFuel(int distance) {
        int sYear = 20;
        if (distance <= sYear) {
            return 1000;
        } else {
            return ((distance - sYear) * 5) + 1000;
        }
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int sum3 = scanner.nextInt();
        scanner.close();
        int maxSum;
        float result;
        maxSum = Math.max(Math.max(sum1, sum2), Math.max(sum2, sum3));
        if (maxSum < 10) {
            result = maxSum * 0.7f;
        } else if (maxSum <= 100) {
            result = maxSum * 1.2f;
        } else {
            result = maxSum * 2.1f;
        }
        System.out.println(result);
    }

    public String getMyPrizes(int ticket) {
        String resVin = "";
        if (ticket % 10 == 0) {
            resVin = "crictal";
        }
        if (ticket % 10 == 7) {
            if (resVin.isEmpty()) {
                resVin = "chip";
            } else {
                resVin = resVin + " " + "chip";
            }
        }
        if (ticket > 200) {
            if (resVin.isEmpty()) {
                resVin = "coin";
            } else {
                resVin = resVin + " " + "coin";
            }
        }
        return resVin.strip();
    }
}
