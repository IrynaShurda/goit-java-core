package com.goit.module6;
public class LevelLoaderTest {
    public static void main(String[] args) {

        ///Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));

    }
}
class LevelLoader{
    private static final LevelLoader instance= new LevelLoader();

    public static LevelLoader getInstance() {
        return instance;
    }

    private LevelLoader() {
    }

    String load(String levelName){
        return "Loading level "+levelName+" ...";
    }
}
