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
public class Circle implements Shape{
    
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double computerArea() {
        
        return Math.PI*this.radius*this.radius;
    }
    
    
    
    
}
