package com.goit.module6;

import java.util.Objects;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);
        Rectangle r4 = new Rectangle(14, 35);
        Rectangle r5 = new Rectangle(14, 28);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));

        System.out.println(r4.canPlaceInto(r5));
    }
}
class Rectangle{
    int a;
    int b;
    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    public boolean canPlaceInto(Rectangle anotherRect){
        return (a<=anotherRect.a && b<= anotherRect.b )
                || (a<=anotherRect.b && b<=anotherRect.a);
    }
}
