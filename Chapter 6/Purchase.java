/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4_14;

/**
 *
 * @author wingki
 */
public class Purchase {

    int invoice;
    double sale;
    double tax;
    final double tax_rate = 0.05;
    
    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }
    
    public void setSale(double sale) {
        this.sale = sale;
        this.tax = sale * this.tax_rate;
    }
    
    public void display() {
        System.out.println("Invoice #: " + this.invoice);
        System.out.println("Sale Amount: $" + this.sale);
        System.out.println("Sales Tax: $" + this.tax);
    }
    

}

//a. Create a class named Purchase. Each Purchase contains an invoice number, 
//amount of sale, and amount of sales tax. Include set methods for the invoice 
//number and sale amount. Within the set() method for the sale amount, calculate 
//the sales tax as 5% of the sale amount. Also include a display method that 
//displays a purchase's details. Save the file as Purchase.java.
//b. Create an application that declares a Purchase object and prompts the user 
//for purchase details. When you prompt for an invoice number, do not let the user 
//proceed until a number between 1,000 and 8,000 has been entered. When you prompt 
//for a sale amount, do not proceed until the user has entered a nonnegative value. 
//After a valid Purchase object has been created, display the object's invoice 
//number, sale amount, and sales tax. Save the file as CreatePurchase.java