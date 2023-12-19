/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw1;

import java.util.Scanner;

/**
 *
 * @author wingki yu
 */


public class QuartsToGallons {
    public static void main(String[] args) {
            int value1 = 18 ; // quart

            int value2 = (value1 / 4) ; // gallon

            System.out.println("A job that needs " + value1 + " quarts required " + value2 + " gallons plus " 
                    + (value1 % 4) + " quarts.");
            
            QuartsToGallonsInteractive.calculateAndDisplay();
    }

    public class QuartsToGallonsInteractive {

        private static void calculateAndDisplay() {
                
                int value1 ; // quart

                Scanner input = new Scanner(System.in);

                System.out.println("Enter the number of quarts needed: ");

                value1 = input.nextInt();

                int value2 = value1 / 4;

                System.out.println("A job that needs " + value1 + " quarts required " + value2 + " gallons plus " 
                        + (value1 % 4) + " quarts.");
      }
    }
   }
    