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
public class RedheadDuck extends Duck{

    public RedheadDuck() {
        bFly=new FlyWithWings();
        bQuack=new Quack();
    }

    
   @Override
    public void display() {

        System.out.println("\tDisplaying");
    }

    
}
