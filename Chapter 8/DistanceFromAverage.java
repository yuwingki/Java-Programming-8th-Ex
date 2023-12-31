/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw8_2;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class DistanceFromAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numbers = new double [20];
        double number = 0;
        int count = 0;
        int total = 0;
        
        final double quit = 99999;
        final int max = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value or " + quit + " to quit >>");
        number = input.nextDouble();
        
        while(number != quit)
        {
            numbers[count] = number;
            total += numbers[count];
            ++count;
            if(count == max)
                number = quit;
            else
            {
                System.out.print("Enter a value or " + quit + " to quit >>");
                number = input.nextDouble();
            }
        }
        
        System.out.println("The numbers entered were: ");
        for(int i = 0; i < count; ++i)
            System.out.println(numbers[i] + " ");
        if(count != 0)
        {
            for(int i = 0; i < count; ++i)
                System.out.println("The difference from the average is " + (numbers[i] - (total/count)));
        }
        else
            System.out.println("No values were entered.");
    }
    
}

//Allow a user to enter any number of double values up to 20. The user should enter 99999 
//to quit entering numbers. Display an error message if the user quits without entering any 
//numbers; otherwise, display each entered value and its distance from the average. Save the 
//file as DistanceFromAverage.java