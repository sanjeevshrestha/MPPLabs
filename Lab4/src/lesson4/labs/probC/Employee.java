/*
 * Name - Sanjeev Shrestha
* ID - 984970
 */
package lesson4.labs.probC;

/**
 *
 * @author sanjeev
 */
public abstract class Employee {

    private long empId;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public void print() {

    }

    public Paycheck calcCompensation(int year, int month) {
        double grossSalary=this.calcGrossPay(year,month);
        return new Paycheck(grossSalary);
    }

    abstract public double calcGrossPay(int year,int month);

}
