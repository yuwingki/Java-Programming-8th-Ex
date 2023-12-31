/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chp8_3;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class CarCareChoice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int number_items = 4;
        String[] services = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};
        int[] prices = {25, 22, 15, 5};
        
        String[] shortservices = new String [number_items];
        for(int i = 0; i < services.length; ++i)
        {
            shortservices[i] = services[i].substring(0,3).toLowerCase();
        }
        
        System.out.println("List of available services in Cody's Car Care Shop: ");
        for(int i = 0; i < services.length; ++i)
        {
            System.out.println(services[i]);
        }
            
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the service (first 3 characters) >>");
        String user = input.nextLine().toLowerCase();
            
        int servicePrice = 0;
        boolean validItem = false;
        
        for(int x = 0; x < number_items; ++x)
        {
            if(shortservices[x].equals(user))
                {
                    validItem = true;
                    servicePrice = prices[x];
                }
        }
        
        if(validItem)
            System.out.println("The price of the " + user + " is $" + servicePrice);
        else
            System.out.println("Error: enter a valid item");  
    }
}

//a. Write an application for Cody's Car Care Shop that shows a user a list of available services: 
//oil change, tire rotation, battery check, or brake inspection. Allow the user to enter a string 
//that corresponds to one of the options, and display the option and its price as $25, $22, $15, or $5, 
//accordingly. Display an error message if the user enters an invalid item. Save the file as CarCareChoice.java.
//b. It might not be reasonable to expect users to type long entries such as “oil change” accurately. 
//Modify the CarCareChoice class so that as long as the user enters the first three characters of a 
//service, the choice is considered valid. Save the file as CarCareChoice2.java.