/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_class2;

/**
 *
 * @author wingki
 */
public class Employee_temp 
{
    private int id;
    private double salary;
    
    public Employee_temp(int idNum, double amt) // method constructor -- initialize class objects -- execute without calling
    {
        id = idNum;
        salary = amt;
    }
    
    public int getID()
    {
        return id;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setId(int idNum)
    {
        id = idNum;
    }
    public void setSalary(double amt)
    {
        salary = amt;
    }
}
