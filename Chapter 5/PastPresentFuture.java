/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3_5;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class PastPresentFuture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month, day, year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        month = input.nextInt();
        System.out.print("Enter the day: ");
        day = input.nextInt();
        System.out.print("Enter the year: ");
        year = input.nextInt();
        String prompt = promptStatement(month, day, year);
        System.out.println("The entered date is " + prompt);
        
    }

    private static String promptStatement(int month, int day, int year) {
        int thismonth = 9;
        int thisyear = 2023;
        String prompt = null;
        if (year != thisyear)
            prompt = "not this year";
            else
            if (month < thismonth && year == thisyear)
                prompt = "in an earlier month this year";
                else
                if (month > thismonth && year == thisyear)
                    prompt = "in a later month this year";
                    else
                    if (month == thismonth && year == thisyear)
                        prompt = "this month";
        return prompt;
    }
    
}

//a. Write an application that prompts a user for a month, day, and year. 
//Display amessage that specifies whether the entered date is (1) not this year, 
//(2) in an earlier month this year, (3) in a later month this year, or (4) this 
//month. Save the file as PastPresentFuture.java.
//b. Use the Web to learn how to use the LocalDate Boolean methods isBefore(), 
//isAfter(), and equals(). Use your knowledge to write a program that prompts a 
//user for a month, day, and year, and then displays a message specifying 
//whether the entered day is in the past, the current date, or in the future. 
//Save the file as PastPresentFuture2.java.