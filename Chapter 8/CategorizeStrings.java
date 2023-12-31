/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw8_5;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class CategorizeStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 10;
        int cutoff = 10;
        int short_sub = 0;
        int long_sub = 0;
        String quit = "QUIT";
        String[] shortList = new String [max];
        String[] longList = new String [max];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 10 or less Strings or " + quit + " to quit >>");
        String input1 = input.nextLine();
        
        while((short_sub + long_sub) < max)
        {
            if(input1.equals(quit))
                break;
            if(input1.length() <= cutoff)
            {
                shortList[short_sub] = input1;
                short_sub++;
            }
            else
            {
                longList[long_sub] = input1;
                long_sub++;
            }
            System.out.println("Enter 10 or less Strings or " + quit + " to quit >>");
            input1 = input.nextLine();
        }
                
        System.out.println("Which type of String to do you want to display? " + 
                "Type 'S' for the short list or 'L' for the long list");
        input1 = input.nextLine();
        if(input1.substring(0,1).toLowerCase().equals("s"))
            display(shortList, short_sub);
        else
            display(longList, long_sub);
            
    }

    private static void display(String[] array, int sub) {
        if(sub == 0)
            System.out.println("This list is empty.");
        else
            for(int i = 0; i < sub; ++i)
                System.out.println(array[i]);
    }
    
}

//a. Write an application that accepts up to 10 Strings, or fewer if the user enters a terminating value. 
//Divide the entered Strings into two lists—one for short Strings that are 10 characters or fewer and the 
//other for long Strings. After data entry is complete, prompt the user to enter which type of String to 
//display, and then output the correct list. For this exercise, you can assume that if the user does not 
//request the list of short strings, the user wants the list of long strings. If there are no Strings in 
//a requested list, output an appropriate message. Prompt the user continuously until a sentinel value is 
//entered. Save the file as CategorizeStrings.java.
//b. Modify the CategorizeStrings application to divide the entered Strings into those that contain no spaces, 
//one space, or more. After data entry is complete, continuously prompt the user to enter the type of String 
//to display. If the user does not enter one of the three valid choices, display all of the String. Save the 
//file as CategorizeStrings2.java.