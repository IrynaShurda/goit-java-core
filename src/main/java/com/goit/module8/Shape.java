package com.goit.module8;

abstract public class Shape implements Colorable, AreaCountable, Drawable {

    private Color color = Color.BLACK;
    String commonName = "The shape name is ";

    @Override
    public void useColor() {
        if (color == Color.BLACK) {
            System.out.println("\t" + this + " color is standard: " + color);
        } else {
            System.out.println("\t" + this + " color is : " + color);
        }
    }

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getCommonName() {
        return commonName;
    }

    public abstract void shapeName();

}
