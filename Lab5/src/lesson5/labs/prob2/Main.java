/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.labs.prob2;

/**
 *
 * @author sanjeev
 */
public class Main {
    
    public static void main(String args[])
    {
        Duck[] ducks={new MallardDuck(),new DecoyDuck(),new RedheadDuck(),new RubberDuck()};
        
        for(Duck d: ducks)
        {
            System.out.println(d.getClass().getSimpleName()+":");
            d.display();
            d.fly();
            d.quack();
            d.swim();
        }
        
    }
    
}
