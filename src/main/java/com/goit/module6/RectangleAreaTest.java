package com.goit.module6;

public class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}
class RectangleArea{
    int x1;
    int x2;
    int y1;
    int y2;

    int area;

    public int getArea() {
        area=Math.abs((y1-x1)*(y2-x2));

        return area;
    }

    public RectangleArea(int[] coords){
        this.x1=coords[0];
        this.x2=coords[1];
        this.y1=coords[2];
        this.y2=coords[3];

    }
}
