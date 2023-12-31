/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw8_6;

/**
 *
 * @author wingki
 */
public class DemoSalesperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int assignId = 9999;
        double assignSales = 0;
        Salesperson[] team = new Salesperson[10];
        
        for(int i = 0; i < team.length; ++i)
        {
            team[i] = new Salesperson(assignId, assignSales);
        }
        for(int i = 0; i < team.length; ++i)
        {
            System.out.println(" Salesperson has ID # " + team[i].getId() + " and annual sales of $" + team[i].getSales());
        }
    }
    
}

//a. Create a class named Salesperson. Data fields for Salesperson include an integer ID number and a 
//double annual sales amount. Methods include a constructor that requires values for both data fields, 
//as well as get and set methods for each of the data fields. Write an application named DemoSalesperson 
//that declares an array of 10 Salesperson objects. Set each ID number to 9999 and each sales value to zero. 
//Display the 10 Salesperson objects. Save the files as Salesperson.java and DemoSalesperson.java.
//b. Modify the DemoSalesperson application so each Salesperson has a successive ID number from 111 through 
//120 and a sales value that ranges from $25,000 to $70,000, increasing by $5,000 for each successive 
//Salesperson. Save the file as DemoSalesperson2.java.