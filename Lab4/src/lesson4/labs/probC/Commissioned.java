/*
 * Name - Sanjeev Shrestha
* ID - 984970
 */
package lesson4.labs.probC;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author sanjeev
 */
public class Commissioned extends Employee {

    private double commission;
    private double baseSalary;

    private List<Order> orders;

    public Commissioned(double commission, double baseSalary) {
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
        //Create some orders
        
        for(int i=1;i<=30;i++)
        {
            double saleamount=Math.random()*1000;
            Order o=new Order(i,new GregorianCalendar(2015,0,i),saleamount);
            addOrder(o);
        }
    }

    public Commissioned() {

        this.orders = new ArrayList<>();
          //Create some orders
        
        for(int i=1;i<=30;i++)
        {
            double saleamount=Math.random()*1000;
            Order o=new Order(1,new GregorianCalendar(2015,0,i),saleamount);
            addOrder(o);
        }
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addOrder(Order o) {

        this.orders.add(o);
    }

    @Override
    public double calcGrossPay(int year, int month) {
        double totalSaleAmount = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");

        for (Order o : this.orders) {
            Calendar cal = o.getOrderDate();
            if (cal.get(Calendar.YEAR) == year && cal.get(Calendar.MONTH) == month) {
                totalSaleAmount += o.getOrderAmount();
            }
        }

        return this.baseSalary + (totalSaleAmount * this.commission) / 100;
    }

}
