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
public class InchesToFeet {

    public static void main(String[] args) {
        int inches = 50; 
        int feet = inches / 12 ; 
        int inchesremainder = inches % 12 ; 
        
        System.out.println(inches + " inches becomes " + feet + " feet and " + inchesremainder + " inches.");
        
        InchesToFeetlnteractive.calculateAndDisplay();
    }
    
    public class InchesToFeetlnteractive {

        private static void calculateAndDisplay() {
                int inches;

                Scanner input = new Scanner(System.in);

                System.out.println("Enter the number of inches: ");

                inches = input.nextInt();

                int feet = inches / 12 ; 
                int inchesremainder = inches % 12 ; 

                System.out.println(inches + " inches becomes " + feet + " feet and " + inchesremainder + " inches.");
      }
    }
}