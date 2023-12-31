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
public class CategorizeStrings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 10;
        int space = 0;
        int oneWordsub = 0;
        int twoWordsub = 0;
        int moreWordsub = 0;
        String quit = "QUIT";
        String[] oneWord = new String [max];
        String[] twoWord = new String [max];
        String[] moreWord = new String [max];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Strings or " + quit + " to quit >>");
        String input1 = input.nextLine();
        
        while((oneWordsub+twoWordsub+moreWordsub) < max)
        {
            if(input1.equals(quit))
                break;
            for(int i = 0; i < input1.length(); ++i)
            {
                if(input1.charAt(i) == ' ')
                   space++;
            }
            if(space == 0)
            {
                oneWord[oneWordsub] = input1;
                oneWordsub++;
            }
            else if(space == 1)
            {
                twoWord[twoWordsub] = input1;
                twoWordsub++;
            }
            else
            {
                moreWord[moreWordsub] = input1;
                moreWordsub++;
            }
            System.out.println("Enter a Strings or " + quit + " to quit >>");
            input1 = input.nextLine();
            space = 0;
        }
                
        System.out.println("Which type of String to do you want to display? " + 
                "Type '1' for the one-word list or '2' for the two-words list" + 
                " or '3' for a list for other words");
        input1 = input.nextLine();
        if(input1.equals("1"))
            display(oneWord, oneWordsub);
        else if(input1.equals("2"))
            display(twoWord, twoWordsub);
        else if(input1.equals("3"))
            display(moreWord, moreWordsub);
        else
        {
            for(int i = 0; i < oneWordsub; ++i)
                System.out.println(oneWord[i]);
            for(int i = 0; i < twoWordsub; ++i)
                System.out.println(twoWord[i]);
            for(int i = 0; i < moreWordsub; ++i)
                System.out.println(moreWord[i]);
        }
            
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