package com.goit.module3;

import java.util.Arrays;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(solver.solve(1, -2, -3)));
        System.out.println(Arrays.toString(solver.solve(1, 12, 36)));
        System.out.println(Arrays.toString(solver.solve(5, 3, 7)));
    }

    public double[] solve(int a, int b, int c) {
        double d = (Math.pow(b, 2)) - 4 * a * c;
        double d1x = -(b / (2 * a));
        double d2x1 = (-b + Math.sqrt(d)) / (2 * a);
        double d2x2 = (-b - Math.sqrt(d)) / (2 * a);
        double max = Math.max(d2x1,d2x2);
        double min = Math.min(d2x1,d2x2);
        if (d == 0) {
           return  new double []{d1x} ;
        } else if (d > 0 ) {
            return new double[]{max,min};
        }else {
            return new double[0];
        }
    }
}
