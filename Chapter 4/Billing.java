/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing;

/**
 *
 * @author wingki
 */
public class Billing {
    private double price;
    private double tax;
    private double total;
    private int quantity;
    private double coupon;
    
    public double getPrice()
    {
        return price;
    }
    public double getTax()
    {
        return tax;
    }
    public double getTotal()
    {
        return total;
    }
    public double getQuantity()
    {
        return quantity;
    }
    public double getCoupon()
    {
        return coupon;
    }
    public void computeBill(double price)
    {
        total = price * (1 + tax);
        System.out.println("The total for the book is $" + total);
    }
    public void computeBill(double price, int quantity)
    {
        total = price * quantity * (1 + tax);
        System.out.println("The total for the books is $" + total);
    }
    public void computeBill(double price, int quantity, double coupon)
    {
        total = (price * quantity - coupon) * (1 + tax);
        System.out.println("The total for the books is $" + total);
    }
}

//Create a class named Billing that includes three overloaded computeBill () 
//methods for a photo book store.
//• When computeBill () receives a single parameter, it represents the price of 
//one photo book ordered. Add 8% tax, and return the total due.
//• When computeBill () receives two parameters, they represent the price of a 
//photo book and the quantity ordered. Multiply the two values, add 8% tax, and 
//return the total due.
//• When computeBill () receives three parameters, they represent the price of a 
//photo book, the quantity ordered, and a coupon value. Multiply the quantity and 
//price, reduce the result by the coupon value, and then add 8% tax and return the total due.
//Write a main() method that tests all three overloaded methods. Save the application as Billing.java.