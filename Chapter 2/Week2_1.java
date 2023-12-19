/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2_1;

import java.util.Scanner;

/**
 *
 * @author wingki yu
 */
public class Week2_1 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String value1;
        int value2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What do you want to say?");
        
        value1 = input.nextLine();
        
        System.out.println("Please enter the number of days");
        
        value2 = input.nextInt();
        
        System.out.println("I want to say " + value1 + ". In " + value2 + " days. We will have " 
                + "long weekend");
    }
    
}
