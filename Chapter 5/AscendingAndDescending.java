/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3_2;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class AscendingAndDescending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        int low, med, high;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();
        if (num1 <= num2 && num1 <= num3)
        {
            low = num1;
            if(num2 <= num3)
            {
                med = num2;
                high = num3;
            }
            else
            {
                med = num3;
                high = num2;
            }
            
        }
        else
        {
            if(num2 <= num1 && num2 <= num3)
            {
                low = num2;
                if(num1 <= num3)
                {
                    med = num1;
                    high = num3;
                }
                else
                {
                    med = num3;
                    high = num1;
                }
            }
            else
            {
                low = num3;
                if(num1 <= num2)
                {
                    med = num1;
                    high = num2;
                }
                else
                {
                    med = num2;
                    high = num1;
                }
            }
        }
        System.out.println("Ascending: " + low + " " + med + " " + high);
        System.out.println("Descending: " + high + " " + med + " " + low);
        
    }
    
}

//Write an application that asks a user to enter three integers. Display them in
//ascending and descending order. Save the file as AscendingAndDescending.java.