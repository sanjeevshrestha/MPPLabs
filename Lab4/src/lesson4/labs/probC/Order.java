/*
 * Name - Sanjeev Shrestha
* ID - 984970
 */
package lesson4.labs.probC;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author sanjeev
 */
public class Order {
    private long orderNo;
    private Calendar orderDate;
    private double orderAmount;

    public Order() {
    }
    
    
    public Order(long orderNo, Calendar orderDate, double orderAmount) {
    
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
    
}
