/**
 * Name - Sanjeev Shrestha
 * Student ID - 984970
 */
package lesson5.labs.prob4.personbirthinfo;

final public class Person {

    private final String name;
    private BirthInfo birthInfo;

    Person(String name) {
        this.name = name;
    }

    void setBirthInfo(BirthInfo b) {
        this.birthInfo = b;
    }

    public String getName() {
        return name;
    }

    public BirthInfo getBirthInfo() {
        return birthInfo;
    }
    
    @Override
    public String toString()
    {
        return name;
    }

}
