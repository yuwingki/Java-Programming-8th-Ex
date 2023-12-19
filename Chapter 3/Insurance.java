/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw2_9;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Insurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current year:"); 
        int currentyear = input.nextInt();
        System.out.println("Enter your birth year:"); 
        int birthyear = input.nextInt();
        
        int premium = premiumCalculator(currentyear, birthyear);
        System.out.println("The premium amount is $" + premium);
    }

    private static int premiumCalculator(int currentyear, int birthyear) {
        int decade = (currentyear - birthyear)/10;
        return (decade + 15) * 20;
    }
    
}

//The Harrison Group Life Insurance company computes annual policy premiums based
//on the age the customer turns in the current calendar year. The premium is 
//computed by taking the decade of the customer's age, adding 15 to it, and 
//multiplying by 20. For example, a 34 year old would pay $360, which is calculated 
//by adding the decades (3) to 15, and then multiplying by 20. Write an application that 
//prompts a user for the current year and a birth year. Pass both to a method that calculates 
//and returns the premium amount, and then display the returned amount. Save the application 
//as Insurance.java