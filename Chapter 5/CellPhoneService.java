/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3_4;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class CellPhoneService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int talk, text, data, price = 0;
        String plan = "";
        Scanner input = new Scanner(System.in);
        System.out.print("What's the maximum monthly talk minutes used? ");
        talk = input.nextInt();
        System.out.print("What's the maximum monthly text messages sent? ");
        text = input.nextInt();
        System.out.print("What's the maximum monthly gigabytes of data used? ");
        data = input.nextInt();
        
        if (talk < 500 && text == 0 && data == 0)
        {
            plan = "plan A";
            price = 49;
            }
        else
            if (talk < 500 && text > 0 && data == 0)    
            {
                plan = "plan B";
                price = 55;
            }
            else
                if (talk >= 500 && text < 100 && data ==0)
                {
                    plan = "plan C";
                    price = 61;
                }
                else
                    if (talk >= 500 && text >= 100 && data == 0)
                    {
                        plan = "plan D";
                        price = 70;
                    }
                    else
                        if (talk >= 500 && text >= 100 && data < 2)
                        {
                            plan = "plan E";
                            price = 79;
                        }
                        else
                            if (talk >= 500 && text >= 100 && data >= 2)
                            {
                                plan = "plan F";
                                price = 87;
                            }
        
        System.out.println("The best Horizon phones plan for you is " + plan 
                + " at $" + price + " per month.");
    }
    
}

//Write a program for Horizon Phones, a provider of cellular phone service. 
//Prompt a user for maximum monthly values for talk minutes used, text messages 
//sent, and gigabytes of data used, and then recommend the best plan for the 
//customer's needs. A customer who needs fewer than 500 minutes of talk and no 
//text or data should accept Plan A at $49 per month. A customer who needs fewer 
//than 500 minutes of talk and any text messages should accept Plan B at $55 per 
//month. A customer who needs 500 or more minutes of talk and no data should 
//accept either Plan C for up to 100 text messages at $61 per month or Plan D 
//for 100 text messages or more at $70 per month. A customer who needs any data 
//should accept Plan E for up to 2 gigabytes at $79 or Plan F for 2 gigabytes or 
//more at $87. Save the file as CellPhoneService.java.

//A: 500 0 0 - 49
//B: 500 500 0 - 55
//C: > 500 100 0 - 61
//D: >500 >100 0 - 70
//E:           <2 - 79
//F:           >2 - 87
