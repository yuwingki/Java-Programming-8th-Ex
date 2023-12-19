/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_1;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class TwelveDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int choice;
       choice = getChoice();
       String suffix;
       if(choice >= 4)
           suffix = "th";
       else
           if(choice == 3)
               suffix = "rd";
           else
               if(choice == 2)
                   suffix = "nd";
                else
                   suffix = "st";
       System.out.println("On the " + choice + suffix + " date of Christmas");
       System.out.println("My true love gave to me");
       switch(choice)
       {
           case 12:
               System.out.println("Twelve drummers drumming");
           case 11:
               System.out.println("Eleven Pipers piping");
                break;
           default:
               System.out.println("Invalid choice");
       }
    }

    private static int getChoice() {
        Scanner kb = new Scanner(System.in);
        int choice;
        System.out.println("From what day you want to start ");
        System.out.print("the song Twelve Days of Christmas? ");
        choice = kb.nextInt();
        return choice;  
    }

    
    
}
