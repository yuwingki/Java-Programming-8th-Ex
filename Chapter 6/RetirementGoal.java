/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4_10;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class RetirementGoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of years you have until retirement >> ");
        int years = kb.nextInt();
        int save = 0;
        while(save <= 0)
        {
            System.out.print("Enter the amount of money you can save annually >> ");
            save = kb.nextInt();
        }
        
        System.out.print("You will have $" + (years * save) + " at retirement.");
    }
    
}

//a. Write an application that prompts a user for the number of years the user 
//has until retirement and the amount of money the user can save annually. If 
//the user enters 0 or a negative number for either value, reprompt the user 
//until valid entries are made. Assume that no interest is earned on the money. 
//Display the amount of money the user will have at retirement. Save the file 
//as RetirementGoal.java.
//b. Modify the RetirementGoal application to display the amount of money the 
//user will have if the user earns 5% interest on the balance every year. Save 
//the file as RetirementGoal2.java