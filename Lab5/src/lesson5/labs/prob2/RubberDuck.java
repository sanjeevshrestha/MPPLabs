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
public class RubberDuck extends Duck {

    public RubberDuck() {
        bFly=new CannotFly();
        bQuack=new Squeak();
    }

    
   @Override
    public void display() {

        System.out.println("\tDisplaying");
    }


    
    
}
