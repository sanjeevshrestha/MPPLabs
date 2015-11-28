/**
 * Name - Sanjeev Shrestha
 * Student ID - 984970
 */

package lesson5.labs.prob4.personbirthinfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String args[])
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        PersonBirthInfo pbi=PersonBirthInfoFactory.getInstance("Sanjeev", LocalDate.parse("2015-10-05",formatter));
        System.out.println(pbi.getPerson());
        System.out.println(pbi.getBirthInfo());
      
        
    }

}
