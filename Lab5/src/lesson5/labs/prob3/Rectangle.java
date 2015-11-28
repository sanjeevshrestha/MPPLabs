/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.labs.prob3;

/**
 *
 * @author sanjeev
 */
public class Rectangle implements Shape {

  

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
      @Override
    public double computerArea() {
        return this.width*this.height;
    }

}
