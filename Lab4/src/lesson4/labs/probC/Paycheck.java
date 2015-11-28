/*
 * Name - Sanjeev Shrestha
* ID - 984970
 */
package lesson4.labs.probC;

/**
 *
 * @author sanjeev
 */
public class Paycheck {

    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public Paycheck() {
        this.grossPay=0;
        this.fica = 23;
        this.state = 5;
        this.local = 1;
        this.medicare = 3;
        this.socialSecurity = 7.5;
    }
    
       public Paycheck(double grossPay) {
        this.grossPay=grossPay;
        this.fica = 23;
        this.state = 5;
        this.local = 1;
        this.medicare = 3;
        this.socialSecurity = 7.5;
    }

    public Paycheck(double grossPay,double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay=grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public void print() {

    }

    public double getNetPay() {
      
        double totalTax=this.fica+this.state+this.local+this.medicare+this.socialSecurity;
        return this.grossPay-(this.grossPay*(totalTax)/100);
    }

}
