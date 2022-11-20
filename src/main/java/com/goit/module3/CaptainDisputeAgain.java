package com.goit.module3;

import java.util.Arrays;

public class CaptainDisputeAgain {
    public static void main(String[] args) {
        CaptainDisputeAgain disputeAgain = new CaptainDisputeAgain();
        System.out.println(disputeAgain.findMin(new int[] {1, 10, 3}));
    }

    public int findMin(int[] triple) {
        int one = triple [0];
        int two =  triple [1];
        int three =  triple [2];
        return one<two && one<three ? one:
                two<one && two<three ? two: three;
    }
}
