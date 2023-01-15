package com.goit.module8;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Color color) {
        super(color);
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void shapeName() {
        System.out.println(getCommonName() + this);
    }

    @Override
    public String toString() {
        return "circle";
    }

    @Override
    public void area() {
        double areaCircle = Math.PI * Math.pow(radius, 2);
        if (radius == 0) {
            System.out.println("\t" + "No information for count area!");
        } else
            System.out.println("\t" + this + " area is : " + areaCircle);
    }

    @Override
    public void draw() {
        String[] triangle = {
                "     * *      ",
                "  *       *   ",
                "*           * ",
                "*           * ",
                "  *       *   ",
                "     * *      "
        };
        for (String line : triangle) {
            System.out.println(line);
        }
        System.out.println("Drawing  " + getColor() + " " + this);
    }
}
