package com.goit.module3;

import java.util.Arrays;

public class HarekDataMaker {
    public static void main(String[] args) {
        HarekDataMaker haker = new HarekDataMaker ();
        String[] names = new String[] {"Oliv", "diz", "pou"};
        int [] ages = new int[] {30,35,70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};
        System.out.println(haker.aggregateSingle(names[0],Integer.toString(ages[0]), planets[0]));
        System.out.println(Arrays.toString(haker.aggregateAll(names,ages, planets)));
    }
    public String aggregateSingle(
            String name, String age, String planet){
    return "name - " + name + ", age - " +  age + ", planet - " + planet;
    }

    public String[] aggregateAll
            (String[] names, int[] ages, String[] planets){
        String mas1 =  aggregateSingle(names[0],Integer.toString(ages[0]), planets[0]);
        String mas2 =  aggregateSingle(names[1],Integer.toString(ages[1]), planets[1]);
        String mas3 = aggregateSingle(names[2],Integer.toString(ages[2]), planets[2]);

        return new String[]{mas1 , mas2, mas3};
    }

}
