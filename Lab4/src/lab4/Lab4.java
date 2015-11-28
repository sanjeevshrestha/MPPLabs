/*
 * Name - Sanjeev Shrestha
* ID - 984970
 */
package lab4;

import java.util.GregorianCalendar;
import lesson4.labs.probC.Commissioned;
import lesson4.labs.probC.Employee;
import lesson4.labs.probC.Hourly;
import lesson4.labs.probC.Order;
import lesson4.labs.probC.Salaried;

/**
 *
 * @author sanjeev
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee hrly=new Hourly(75.00);
        System.out.println(hrly.calcCompensation(2015, 1).getNetPay());
        
        
        Employee sal=new Salaried(12000);
        System.out.println(sal.calcCompensation(2015, 1).getNetPay());
        
        Employee com=new Commissioned(5,12000);
        
      
        
        System.out.println(com.calcCompensation(2015, 0).getNetPay());
        
        
    }
    
}
