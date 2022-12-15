package com.goit.module6;

public class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}
class Level{
    String nameLevel;
    public Level(String nameLevel) {
        this.nameLevel=nameLevel;
    }

    @Override
    public String toString() {
        return "Quarke level, name is "+nameLevel;
    }
}
