/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billing;

/**
 *
 * @author wingki
 */
public class Billing_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 5.25;
        double tax = 0.08;
        double total;
        int quantity = 2;
        double coupon = 3;
        
        Billing book1 = new Billing();
        book1.computeBill(price);
        book1.computeBill(price, quantity);
        book1.computeBill(price, quantity, coupon);
    }
    
}

