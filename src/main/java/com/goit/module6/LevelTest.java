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
        System.out.println(new Level("Test", points));
    }
}
class Level{
    private String nameLevel;
    private int point;
    public Level(String nameLevel, Point[] points) {
        this.nameLevel=nameLevel;
        this.point= points.length;
    }

    @Override
    public String toString() {
        return "Quarke level, name is "+nameLevel+", point count is "+point;
    }
    static class Point{
        int x;
        int y;
        private Point[] points;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
        public Point(int x, int y){
            this.x=x;
            this.y=y;

        }
    }
}

