package com.goit.module5;

public class SpaceportMessages {

    public static void main(String[] args) {
        System.out.println(SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40"));
    }
    public static String generateLandingMessage(String shipName, String spaceport, String time){
        return "Spaceship "+ shipName+" landing at "+ spaceport+", time is " + time;
    }
}
