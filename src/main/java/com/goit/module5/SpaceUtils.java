package com.goit.module5;

public class SpaceUtils {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static void main(String[] args) {
        System.out.println(SpaceUtils.PLANET_COUNT);
        System.out.println(SpaceUtils.pluralPlanets(1));
        System.out.println(SpaceUtils.pluralPlanets(5));
        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40"));
    }

    public static String pluralPlanets(int planetCount) {
        if (planetCount == 1) {
            return "1 planet";
        } else {
            return planetCount + " planets";
        }
    }

    public static String generateStartMessage(String shipName, String time) {
        return "Ship " + shipName + " start at " + time;
    }

}
