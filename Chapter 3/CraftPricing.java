/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw2_10;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class CraftPricing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the product:"); 
        String productname = input.nextLine();
        System.out.println("Enter the cost of the product:"); 
        double cost = input.nextDouble();
        System.out.println("Enter the number of hours of work required to create the product:"); 
        double hour = input.nextDouble();
        
        double price = priceGenerate(productname, cost, hour);
        System.out.println("The retail price of the product, " + productname + ", is $" + price);
    }

    private static double priceGenerate(String productname, double cost, double hour) {
        return cost + (12 * hour) + 7;
    }
    
}

//Caitlyn's Crafty Creations computes a retail price for each product as the cost of 
//materials plus $12 multiplied by the number of hours of work required to create the 
//product, plus $7 shipping and handling. Create a class that contains a main() method 
//that prompts the user for the name of a product (for example, “woven purse”), the cost 
//of materials, and the number of hours of work required. Pass the numeric data to a method 
//that computes the retail price of the product and returns the computed value to the main() 
//method where the product name and price are displayed. Save the program as CraftPricing.java.