/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw2_8;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class PaintCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangular room in feet:"); 
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangular room in feet:"); 
        double width = input.nextDouble();
        System.out.println("Enter the height of the rectangular room in feet:"); 
        double height = input.nextDouble();
        
        double wallArea = wallCalculator(length, width, height);
        double paint = paintNeeded(wallArea);
        double price = priceCalculator(paint);
        
        System.out.println("In total, " + paint + " gallons of paint are needed for this room.");
        System.out.println("The cost to paint a " + length + "-by-" + width 
                + "-foot room with " + height + "-foot ceilings is $" + price);
    }

    private static double wallCalculator(double length, double width, double height) {
        double sideWall = (length * height)*2;
        double frontWall = (width * height)*2;
        return (sideWall + frontWall);        
            }
    
    private static double paintNeeded(double wallArea) {
        return wallArea / 350;
        
    }

    private static double priceCalculator(double paint) {
        return paint * 32;
    }
    
}

//Assume that a gallon of paint covers about 350 square feet of wall space. Create an 
//application with a main() method that prompts the user for the length, width, and 
//height of a rectangular room. Pass these three values to a method that does the following:
//• Calculates the wall area for a room
//• Passes the calculated wall area to another method that calculates and returns the number 
//of gallons of paint needed
//• Displays the number of gallons needed
//• Computes the price based on a paint price of $32 per gallon, assuming that the painter 
//can buy any fraction of a gallon of paint at the same price as a whole gallon
//• Returns the price to the main() method
//The main() method displays the final price. For example, the cost to paint a 15-by-20-foot 
//room with 10-foot ceilings is $64. Save the application as PaintCalculator.java