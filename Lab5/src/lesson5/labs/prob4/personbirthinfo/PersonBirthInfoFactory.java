/**
 * Name - Sanjeev Shrestha
 * Student ID - 984970
 */

package lesson5.labs.prob4.personbirthinfo;

import java.time.LocalDate;

public class PersonBirthInfoFactory {
    
    public static PersonBirthInfo getInstance(String name, LocalDate dob)
    {
      Person p=new Person(name);
      
      BirthInfo bi=new BirthInfo(dob);
      
      return new PersonBirthInfoImpl(p,bi);
      
    }

}
