package com.goit.module4;

public class TriangleDrawer {
    public static void main(String[] args) {
        TriangleDrawer triangleDrawer = new TriangleDrawer();
        System.out.println(new TriangleDrawer().drawTriangle(5));
    }

    public String drawTriangle(int side) {
        String triangle = "";
        int index = 0;
        while (side > index) {
            System.out.println("*".repeat(side)); //***
            side--;
            if (side != 0){
                System.out.println("*".repeat(side));
                side--;
            }else {
                break;}
        }
        return "";
    }
}
