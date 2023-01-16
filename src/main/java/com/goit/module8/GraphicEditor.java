package com.goit.module8;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape[] shapesArr = new Shape[5];

        Shape circle = new Circle(Color.RED, 3);
        Shape quad = new Quad(9);
        Shape rectangle = new Rectangle(Color.GREEN);
        Shape rhombus = new Rhombus(Color.WHITE,8,4);
        Shape triangle = new Triangle(7, 6);


        shapesArr[0] = circle;
        shapesArr[1] = quad;
        shapesArr[2] = rectangle;
        shapesArr[3] = rhombus;
        shapesArr[4] = triangle;

        for (Shape shape : shapesArr) {
            ShapePrinter.printShapeName(shape);     // for static method
            shape.useColor();
            shape.area();
            shape.draw();
            System.out.println("_____________________________");
        }
    }
}
