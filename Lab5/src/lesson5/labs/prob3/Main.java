/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.labs.prob3;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author sanjeev
 */
public class Main {

    public static void main(String args[]) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(12));
        shapes.add(new Rectangle(12, 20));
        shapes.add(new Triangle(12, 20));
        shapes.add(new Circle(7));
        shapes.add(new Rectangle(4, 8));
        shapes.add(new Triangle(7, 8));
        shapes.add(new Circle(11));
        shapes.add(new Rectangle(14, 26));
        shapes.add(new Triangle(10, 20));

        double sumOfAreas = 0;
        for (Shape s : shapes) {
            sumOfAreas += s.computerArea();
        }

        System.out.println("Sum of Areas = " + sumOfAreas);

    }
}
