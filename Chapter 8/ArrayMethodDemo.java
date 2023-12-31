/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chp8_hw4;

/**
 *
 * @author wingki
 */
public class ArrayMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,3,4,5,7,8,10,13,15,20};
        int limit = 6;
        
        display(array);
        System.out.println(" ");
        displayReverse(array);
        System.out.println(" ");
        sumInt(array);
        limitInt(array, limit);
        System.out.println(" ");
        avgHigh(array);
        
    }

    public static void display(int[] array) {
        System.out.print("Display number: ");
        for(int i = 0; i < array.length; ++i)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void displayReverse(int[] array) {
        System.out.print("Display in reverse order: ");
        for(int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void sumInt(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++)
        {
            total += array[i];
        }
        
        System.out.println("The sum of the integers is " + total);
    }

    public static void limitInt(int[] array, int limit) {
        System.out.print("Numbers greater than " + limit + " are: ");
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > limit)
            {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void avgHigh(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++)
        {
            total += array[i];
        }
        int avg = total/array.length;
        System.out.print("Numbers greater than " + avg + " are: ");
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > avg)
            {
                System.out.print(array[i] + " ");
            } 
        }
    }
} 

//Create an application containing an array that stores 10 integers. The application should 
//call five methods that in turn (1) display all the integers, (2) display all the integers 
//in reverse order, (3) display the sum of the integers, (4) display all values less than a 
//limiting argument, and (5) display all values that are higher than the calculated average 
//value. Save the file as ArrayMethodDemo.java.