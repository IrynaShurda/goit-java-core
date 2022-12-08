package com.goit.module5;

public class SpaceportMessages {

    public static void main(String[] args) {
        String result = SpaceportMessages.generateLandingMessage("SunFlower", "EarthKeeper", "20:40");
        System.out.println(result);

    }
    public static String generateLandingMessage(String shipName, String spaceport, String time){
        return "Spaceship "+ shipName+" landing at "+ spaceport+", time is " + time;
    }
}
