package com.goit.module5;

public abstract class SpaceObject {
    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be "planet"
        System.out.println(tester.test(new Moon())); //Should be "not planet"
    }
}

abstract class Planet extends SpaceObject {
}

class Mars extends Planet {

}

class Moon extends SpaceObject {

}

class PlanetTester {


    public String test(SpaceObject object) {
        //System.out.println(object.getClass());
        //return object.getClass();
        String result;
        if (object instanceof Planet) {
           result ="planet";
        } else {
            result ="not planet";
        }
        return result;
    }
}