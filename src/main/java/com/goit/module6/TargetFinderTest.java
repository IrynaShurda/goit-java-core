package com.goit.module6;

import java.util.Arrays;

public class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder{

    public int[] findTarget(int[] aiCoords, int[][] targets){
        int xCoord=aiCoords[0];
        int yCoord=aiCoords[1];
        int resultMin = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < targets.length; i++) {
            int endX=targets[i][0];
            int endY=targets[i][1];
            int nextDistance = getDistance(xCoord, yCoord, endX, endY);
            if (resultMin> nextDistance){
                resultMin= nextDistance;
                index=i;
            }
        }
        return targets[index];
    }

    public int getDistance(int xCoord, int yCoord, int endX,int endY){
       return (int) Math.sqrt(Math.pow(xCoord-endX,2)+Math.pow(yCoord-endY,2));
    }
}
