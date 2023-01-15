package com.goit.module8;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape[] shapesArr = new Shape[5];

        Circle circle = new Circle(Color.RED, 3);
        Quad quad = new Quad(9);
        Rectangle rectangle = new Rectangle(Color.GREEN);
        Rhombus rhombus = new Rhombus(Color.WHITE,8,4);
        Triangle triangle = new Triangle(7, 6);


        shapesArr[0] = circle;
        shapesArr[1] = quad;
        shapesArr[2] = rectangle;
        shapesArr[3] = rhombus;
        shapesArr[4] = triangle;

        for (Shape shape : shapesArr) {
            printShapeName(shape);
            shape.useColor();
            shape.area();
            shape.draw();
            System.out.println("_____________________________");
        }
    }

    public static void printShapeName(Shape shape) {
        shape.shapeName();
    }

    public static void printShape(Shape shape) {
    }
}
