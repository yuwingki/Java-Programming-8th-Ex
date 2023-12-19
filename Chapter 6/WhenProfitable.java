/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4_9;

/**
 *
 * @author wingki
 */
public class WhenProfitable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gross = 20000;
        double expense = 35000;
        double net = gross - expense;
        int year = 1;
        
        System.out.println("Year of Business: " + year);
        System.out.println("Gross Profit: " + gross);
        System.out.println("Expenses: " + expense);
        System.out.println("Net Profit: " + net);
        
        while(year < 20)
        {
            gross = gross * 1.1;
            expense = expense * 1.04;
            net = gross - expense;
            year ++;
            System.out.println("Year of Business: " + year);
            System.out.println("Gross Profit: " + gross);
            System.out.println("Expenses: " + expense);
            System.out.println("Net Profit: " + net);
        }
        
    }
    
}

//Write an application that computes a business's potential profits each year 
//for 20 years using the following assumptions: (1) Gross profit in the first 
//year is projected to be $20,000. (2) Expenses in the first year are expected 
//to be $35,000. (3) Net profit or loss is gross profit minus expenses. (4) Gross 
//profits are expected to increase 10 percent each year. (5) Expenses are expected 
//to increase 4 percent each year. Display the year, the gross profit, the expenses, 
//and the net profit for each year. Also display the year in which a net profit 
//is first reported. Save the file as WhenProfitable.java.