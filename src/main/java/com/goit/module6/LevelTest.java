package com.goit.module6;

public class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
//        System.out.println(new Level("Test"));
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
//        System.out.println(new Level("Test", points));

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
//        System.out.println(new Level(info, points));

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}

class Level {
    LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName()
                + ", difficulty is " + levelInfo.getDifficulty()
                + ", point count is " + points.length;
    }

    public int calculateLevelHash() {
        int resultSum = 0;
        for (Point point : points) {
            resultSum += point.getMultiplication();
        }
        return resultSum;
    }

    static class Point {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getMultiplication() {
            return getX() * getY();
        }
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }
    }


}

