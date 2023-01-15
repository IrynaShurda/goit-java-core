package com.goit.module8;

public class Quad extends Shape {
    private double side;

    public Quad() {
    }

    public Quad(double side) {
        this.side = side;
    }

    public Quad(Color color) {
        super(color);
    }

    public Quad(Color color, double side) {
        super(color);
    }

    @Override
    public void shapeName() {
        System.out.println(getCommonName() + this);
    }

    @Override
    public String toString() {
        return "quad";
    }

    @Override
    public void area() {
        double areaQuad = Math.pow(side, 2);
        if (side == 0) {
            System.out.println("\t" + "No information for count area!");
        } else
            System.out.println("\t" + this + " area is : " + areaQuad);
    }

    @Override
    public void draw() {
        String[] triangle = {
                "       ",
                " * * * ",
                " *   * ",
                " * * * ",
                "       "
        };
        for (String line : triangle) {
            System.out.println(line);
        }
        System.out.println("Drawing  " + getColor() + " " + this);
    }
}
