/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw2_6;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class BookstoreCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's name:"); 
        String name = input.nextLine();
        System.out.println("Enter the student's grade point average:"); 
        double grade = input.nextDouble();
        
        creditCalculation(name, grade);
    }

    private static void creditCalculation(String name, double grade) {
        double credit = (grade * 10);
        System.out.println(name + " has a grade point average of " + grade 
                + ". This student will receive a bookstore credit of " + credit);
    }
    
}

//To encourage good grades, Hermosa High School has decided to award each student a bookstore 
//credit that is 10 times the student's grade point average. In other words, a student with 
//a 3.2 grade point average receives a $32 credit. Create a class that prompts a student for 
//a name and grade point average, and then passes the values to a method that displays a 
//descriptive message. The message uses the student's name, echoes the grade point average, 
//and computes and displays the credit. Save the application as BookstoreCredit.java.