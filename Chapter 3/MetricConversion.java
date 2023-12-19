/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw2_7;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class MetricConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the inches:"); 
        int inch = input.nextInt();
        System.out.println("Enter the gallons:"); 
        int gallons = input.nextInt();
        
        conversionsInch(inch);
        conversionsGallons(gallons);
    }

    private static void conversionsInch(int inch) {
        double cm = (inch * 2.54);
        
        System.out.println("There are 2.54 centimeters in an inch. Hence, there are " 
                + cm + " cm in " + inch + " inches.");
    }

    private static void conversionsGallons(int gallons) {
        double liters = (gallons * 3.7854);
        
        System.out.println("There are 3.7854 liters in a U.S. gallon. Hence, there are " 
                + liters + " liters in " + gallons + " gallons.");
    }
    
}


//There are 2.54 centimeters in an inch, and there are 3.7854 liters in a U.S. gallon.
//Create a class named MetricConversion. Its main() method accepts an integer value 
//from a user at the keyboard, and in turn passes the entered value to two methods. 
//One converts the value from inches to centimeters and the other converts the same 
//value from gallons to liters. Each method displays the results with appropriate 
//explanation. Save the application as MetricConversion.java.