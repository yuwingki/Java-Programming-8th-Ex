/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw2_5;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Percentages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:"); 
        double num1 = input.nextInt();
        System.out.println("Enter the second number:"); 
        double num2 = input.nextInt();
        
        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    private static void computePercent(double num1, double num2) {
        double per1 = (num1/num2 * 100);
        System.out.println(num1 + " is " + per1 + " percent of " + num2);
    }
    
}

//a. Create an application named Percentages whose main() method holds two double 
//variables. Assign values to the variables. Pass both variables to a method named 
//computePercent() that displays the two values and the value of the first number 
//as a percentage of the second one. For example, if the numbers are 2.0 and 5.0, 
//the method should display a statement similar to “2.0 is 40 percent of 5.0.” 
//Then call the method a second time, passing the values in reverse order. Save 
//the application as Percentages.java.
//b. Modify the Percentages class to accept the values of the two doubles from 
//a user at the keyboard. Save the file as Percentages2.java.