package com.goit.module8;

public class Rhombus extends Shape {

    private double diagonal1;
    private double diagonal2;

    public Rhombus() {
    }

    public Rhombus(Color color) {
        super(color);
    }

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(Color color, double diagonal1, double diagonal2) {
        super(color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public void shapeName() {
        System.out.println(getCommonName() + this);
    }

    @Override
    public String toString() {
        return "rhombus";
    }

    @Override
    public void area() {
        double areaRhombus = (diagonal1 * diagonal2) / 2;
        if (diagonal1 == 0 || diagonal2 == 0) {
            System.out.println("\t" + "No information for count area!");
        } else
            System.out.println("\t" + this + " area is : " + areaRhombus);
    }

    @Override
    public void draw() {
        String[] triangle = {
                "   *   ",
                "  * *  ",
                " *   * ",
                "  * *  ",
                "   *   "
        };
        for (String line : triangle) {
            System.out.println(line);
        }
        System.out.println("Drawing  " + getColor() + " " + this);
    }
}
