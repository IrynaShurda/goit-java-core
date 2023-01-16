package com.goit.module8;

public class ShapePrinter {
    private final Shape shape;

    public ShapePrinter(Shape shape) {
        this.shape = shape;
    }

    // static method
//    public static void printShapeName(Shape shape) {
//        shape.shapeName();
//    }
    public void printShapeName() {
        shape.shapeName();
    }
}
