/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.labs.prob2;

/**
 *
 * @author 984970
 */
public abstract class Duck {
    
    protected FlyBehavior bFly;
    protected QuackBehavior bQuack;
    
    public abstract void display();
    
    public void swim()
    {
        System.out.println("\tSwimming");
    }

    public void quack()
    {
        this.bQuack.quack();
    }
    
    public void fly()
    {
        this.bFly.fly();
    }
    
}
