/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw1_8;

import java.util.Scanner;

/**
 *
 * @author wingki
 */

public class Eggs {

    public static void main(String[] args) {
        int eggs; // eggs ordered
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of eggs in the order: ");
        
        eggs = input.nextInt();
        
        int dozen = (eggs / 12);
        int loose = (eggs % 12);
                
        System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen and " 
                + loose + " loose eggs at 45 cents each for a total of $" + ((dozen * 3.25) + (loose * 0.45)));
    }
    
}