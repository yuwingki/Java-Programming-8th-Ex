/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4_55;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Inbetween {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter first integer >> ");
        int FIRST = kb.nextInt();
        System.out.print("Enter second integer >> ");
        int SECOND = kb.nextInt();
        if(FIRST < SECOND)
        {
            int BETWEEN = FIRST + 1;
            if(BETWEEN >= SECOND)
            {
                System.out.print("There are no integers between the integers.");
            }
            else
            {
                for(int i = BETWEEN; i < SECOND; i ++)
                {
                    System.out.print(i + " ");
                }
            }
        }
        else if(FIRST > SECOND)
        {
            int BETWEEN = SECOND + 1;
            if(BETWEEN >= FIRST)
            {
                System.out.print("There are no integers between the integers.");
            }
            else
            {
                for(int i = BETWEEN; i < FIRST; i ++)
                {
                    System.out.print(i + " ");
                }
            }
        } 
        else
        {
            System.out.print("There are no integers between the integers.");
        }
    }
}

//Write an application that prompts a user for two integers and displays every 
//integer between them. Display a message if there are no integers between the 
//entered values. Make sure the program works regardless of which entered value 
//is larger. Save the file as Inbetween.java