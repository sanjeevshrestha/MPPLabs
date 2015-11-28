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
public class Triangle implements Shape{
    
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double computerArea() {
        
        return (this.base*this.height)/2;
    }
    
}
