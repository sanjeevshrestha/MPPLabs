/**
 * Name - Sanjeev Shrestha
 * Student ID - 984970
 */
package lesson5.labs.prob4.personbirthinfo;

public class PersonBirthInfoImpl implements PersonBirthInfo {

    private Person person;
    private BirthInfo birthInfo;

    public PersonBirthInfoImpl(Person p, BirthInfo b) {
        this.person = p;
        this.birthInfo = b;
    }

    public Person getPerson() {
        return person;
    }

    public BirthInfo getBirthInfo() {
        return birthInfo;
    }

}
