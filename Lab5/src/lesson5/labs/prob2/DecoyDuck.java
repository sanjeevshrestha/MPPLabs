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
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        bFly=new CannotFly();
        bQuack=new MuteQuack();
    }

    
    @Override
    public void display() {

        System.out.println("\tDisplaying");
    }



}
