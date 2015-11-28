/*
 * Name - Sanjeev Shrestha
* ID - 984970
 */
package lesson4.labs.probC;

/**
 *
 * @author sanjeev
 */
public class Salaried extends Employee{
    
    private double salary;

    public Salaried(double salary) {
        this.salary = salary;
    }

    public Salaried() {
    }
    
    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int year, int month) {
        return this.salary;
    }
    
}
