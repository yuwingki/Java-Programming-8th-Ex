/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3_2;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Week3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first number <<");
        num1 = kb.nextDouble();
        System.out.println("Enter the second number <<");
        num2 = kb.nextDouble();
        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    private static void computePercent(double num1, double num2) {
        System.out.println(num1 + " is" + (num1/num2)*100 + "% of " + num2);
    }
    
}
