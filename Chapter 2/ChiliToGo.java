/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw1_9;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class ChiliToGo {

    public static void main(String[] args) {
        int adultmeal ; 
        int childmeal ; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of adult meals you are ordering: ");
        
        adultmeal = input.nextInt();
        
        System.out.println("Enter the number of children meals you are ordering: ");
        
        childmeal = input.nextInt();
        
        System.out.println("You ordered " + adultmeal + " adultmeals and " + childmeal 
                + " children meals. The price is $7 for an adult meal and $4 for a child's meal. The total of your meals is $" 
                + ((adultmeal * 7) + (childmeal * 4)));
        
        ChiliToGoProfit.calculateAndDisplay();
    }
    
    public class ChiliToGoProfit {

        private static void calculateAndDisplay() {
                double adultmeal ; 
                double childmeal ; 

                Scanner input = new Scanner(System.in);

                System.out.println("Enter the number of adult meals ordered: ");

                adultmeal = input.nextInt();

                System.out.println("Enter the number of children meals ordered: ");

                childmeal = input.nextInt();

                System.out.println("This order has " + adultmeal + " adultmeals and " + childmeal 
                        + " children meals. The profits for adult meals and for children's meals are " 
                        + (adultmeal * 4.35) + " and " + (childmeal * 3.1) + ". The total profit of this order is $" 
                        + ((adultmeal * 4.35) + (childmeal * 3.1)));
      }
    }
}