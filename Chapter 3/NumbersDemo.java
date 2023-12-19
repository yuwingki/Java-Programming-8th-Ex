/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw2_4;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class NumbersDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num1 = 4;
         int num2 = 9;
         
         displayTwiceTheNumber(num1, num2);
         displayNumberPlusFive(num1, num2);
         displayNumberSquared(num1, num2);
    }

    private static void displayTwiceTheNumber(int num1, int num2) {
        int twice1 = (num1 * 2);
        int twice2 = (num2 * 2);
        System.out.println("Twices of " + num1 + " and " + num2 + " are " + twice1 + " and " + twice2);
    }

    private static void displayNumberPlusFive(int num1, int num2) {
        int five1 = (num1 + 5);
        int five2 = (num2 + 5);
        System.out.println(num1 + " plus five and " + num2 + " plus five are " + five1 + " and " + five2);
    }

    private static void displayNumberSquared(int num1, int num2) {
        int square1 = (num1 * num1);
        int square2 = (num2 * num2);
        System.out.println("Squares of " + num1 + " and " + num2 + " are " + square1 + " and " + square2);
    }
    
}


// a. Create an application named NumbersDemo whose main() method holds two integer 
//variables. Assign values to the variables. In turn, pass each value to methods 
//named displayTwiceTheNumber(), displayNumberPlusFive(), and displayNumberSquared().
//Create each method to perform the task its name implies. Save the application as 
//NumbersDemo.java.
//b. Modify the NumbersDemo class to accept the values of the two integers from a 
//user at the keyboard. Save the file as NumbersDemo2.java.