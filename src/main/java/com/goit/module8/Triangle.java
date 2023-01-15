package com.goit.module8;

public class Triangle extends Shape {

    private double side;
    private double height;

    public Triangle() {
    }

    public Triangle(Color color) {
        super(color);
    }

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public Triangle(Color color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public void shapeName() {
        System.out.println(getCommonName() + this);
    }

    @Override
    public String toString() {
        return "triangle";
    }

    @Override
    public void area() {
        double areaShape = side * height * 0.5d;
        if (side == 0 || height == 0) {
            System.out.println("\t" + "No information for count area!");
        } else
            System.out.println("\t" + this + " area is : " + areaShape);
    }

    @Override
    public void draw() {
        String[] triangle = {
                "   *   ",
                "  * *  ",
                " *   * ",
                "*     *",
                "* * * *"
        };
        for (String line : triangle) {
            System.out.println(line);
        }
        System.out.println("Drawing  " + getColor() + " " + this);
    }
}
