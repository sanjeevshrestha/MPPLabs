/**
 * Name - Sanjeev Shrestha
 * Student ID - 984970
 */
package lesson5.labs.prob4.personbirthinfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

final public class BirthInfo {

    private final LocalDate dateOfBirth;

    private Person person;

    BirthInfo(LocalDate dob) {
        dateOfBirth = dob;
    }

    void setPerson(Person p) {
        this.person = p;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString()
    {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                
                return dateOfBirth.format(formatter);

    }
    
}
