/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw1_10;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Dollars {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount in dollars: ");
        
        int dollars = input.nextInt();
                
        int twenties = dollars / 20;
        int remainderAfterTwenties = dollars % 20;

        int tens = remainderAfterTwenties / 10;
        int remainderAfterTens = remainderAfterTwenties % 10;

        int fives = remainderAfterTens / 5;
        int ones = remainderAfterTens % 5;

        System.out.println("The amount $" + dollars + " can be converted into: " + twenties + " twenties " + tens 
                + " tens " + fives + " fives " + ones + " ones ");
        
    }
}