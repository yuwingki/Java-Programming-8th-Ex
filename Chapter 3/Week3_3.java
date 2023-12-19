/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3_3;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Week3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pricePerBarrel;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current gas price per barrel");
        //pricePerBarrel = input.nextInt();
        //calculatePricePerGallon(pricePerBarrel);
        calculatePricePerGallon(input.nextInt());
    }

    private static void calculatePricePerGallon(int pricePerBarrel) {
        double low = 3.50;
        double high = 4.0;
        double base = 100;
        //double lowPPG;
        
        //double low = 3.50, high = 4.0, base = 100;
        double lowPPG = (pricePerBarrel / base) * low;
        double highPPG = (pricePerBarrel / base) * high;
        System.out.println("When gas is " + pricePerBarrel + " per barrel, then the " 
                + "price will be from " + lowPPG + " to " + highPPG + " per gallon");
    }
    
}
