package com.goit.module2;

public class MarsEarthHelper {
    public int convertAppleCount(float count) {
        return (int) count;
    }

    public byte countAppleCount(int garden1Count, int garden2Count) {
        return (byte) (garden1Count + garden2Count);
    }

    public float calculateTotalAppleWeight(double treeAge) {
return (float) treeAge*9.18f;
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        //Should be 10
        System.out.println("convertAppleCount(10f) = "
                + helper.convertAppleCount(10f));

        //Should be 17
        System.out.println("countAppleCount(10, 7) = "
                + helper.countAppleCount(10, 7));

        //Should be 9.18
        System.out.println("calculateTotalAppleWeight(1d) = "
                + helper.calculateTotalAppleWeight(1d));
    }
}
