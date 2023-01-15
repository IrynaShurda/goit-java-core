package com.goit.module8;

public class Rectangle extends Shape {

    private double side1;
    private double side2;

    public Rectangle() {
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, double side1, double side2) {
        super(color);
    }

    @Override
    public void shapeName() {
        System.out.println(getCommonName() + this);
    }

    @Override
    public String toString() {
        return "rectangle";
    }

    @Override
    public void area() {
        double areaRectangle = side1 * side2;
        if (side1 == 0 || side2 == 0) {
            System.out.println("\t" + "No information for count area!");
        } else
            System.out.println("\t" + this + " area is : " + areaRectangle);
    }

    @Override
    public void draw() {
        String[] triangle = {
                " * * * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " * * * "
        };
        for (String line : triangle) {
            System.out.println(line);
        }
        System.out.println("Drawing  " + getColor() + " " + this);
    }
}
