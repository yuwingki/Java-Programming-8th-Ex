/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw1;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class NauticalMiles {

    public static void main(String[] args) {
        double value1 = 1.852 ; // kilometers
        double value2 = 1.150779 ; // miles
        
        System.out.println("There are " + value1 + " kilometers or " + value2 + " miles in a nautical mile.");
        
        NauticalMilesInteractive.calculateAndDisplay();
    }
    
    public class NauticalMilesInteractive {

        private static void calculateAndDisplay() {
                int value3 ; // nautical mile

                Scanner input = new Scanner(System.in);

                System.out.println("Enter the number of nautical miles: ");

                value3 = input.nextInt();

                double value1 = value3 * 1.852 ; // kilometers
                double value2 = value3 * 1.150779 ; // miles

                System.out.println("There are " + value1 + " kilometers or " + value2 + " miles in " + value3 + " nautical miles.");
      }
    }
}
