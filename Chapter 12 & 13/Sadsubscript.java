/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chp12_class1;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Sadsubscript {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = {"Ariel","Brad","Carla","Emily"};
        
        Scanner kb = new Scanner(System.in);
        int number;
        try
        {
        System.out.println("Enter a number, and I will display a name");
        number = kb.nextInt();
        System.out.println("Name is " + names[number]);
        }
        catch(Exception e)
        {
        System.out.println("The value you entered is not correct. Please re-enter.");
        }
    }
    
    
}
