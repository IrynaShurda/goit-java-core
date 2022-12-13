package com.goit.module6;

public class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance
                (10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance
                (10, 10, 27, 25).getDistance());
    }
}
class Distance{
    double startX;
    double startY;
    double endX;
    double endY;

    Distance (int startX, int startY, int endX, int endY){
this.startX=startX;
this.startY=startY;
this.endX=endX;
this.endY=endY;
    }

    public int getDistance(){
        double result;
        result= Math.round( Math.sqrt(Math.pow(startX-endX,2)+Math.pow(startY-endY,2)));


return (int) result;
    }


}
