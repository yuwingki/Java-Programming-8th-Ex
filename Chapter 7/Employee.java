/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_class2;

/**
 *
 * @author wingki
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int assignId = 111;
        int assignSalary = 50000;
        Employee_temp[] myComp = new Employee_temp[10];
        
        for(int i = 0; i < myComp.length; ++i)
        {
            myComp[i] = new Employee_temp(assignId, assignSalary);
            ++assignId;
            assignSalary = assignSalary + 50000;
        }
        for(int i = 0; i < myComp.length; ++i)
        {
            System.out.println(" Employee has ID # " + myComp[i].getID() + " and salary of $" + myComp[i].getSalary());
        }
    }
    
}
