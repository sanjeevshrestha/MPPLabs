/*
 * Name - Sanjeev Shrestha
* ID - 984970
 */
package lesson4.labs.probC;

/**
 *
 * @author sanjeev
 */
public class Hourly extends Employee {

    private double hourlyWage;
    private int hoursPerWeek;

    public Hourly() {
        this.hoursPerWeek = 40;
    }

    public Hourly(double wage) {
        this.hoursPerWeek = 40;
        this.hourlyWage = wage;
    }

    public Hourly(double wage, int hrs) {
        this.hoursPerWeek = hrs;
        this.hourlyWage = wage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int year, int month) {

        return this.hourlyWage * this.hoursPerWeek * 4;
    }

}
