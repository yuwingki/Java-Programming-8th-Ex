/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testfitnesstracker_main;

/**
 *
 * @author wingki
 */

import java.time.LocalDate;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private LocalDate date;
    
    public String getActivity()
    {
        return activity;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public LocalDate getDate()
    {
        return date;
    }
    public FitnessTracker()
    {
        activity = "Running";
        minutes = 0;
        date = LocalDate.of(LocalDate.now().getYear(), 1, 1);
    }
    public FitnessTracker(String a, int m, LocalDate d)
    {
        this.activity = a;
        this.minutes = m;
        this.date = d;
    }
    //public FitnessTracker(String activity, int minutes, LocalDate date)
    //{
    //    this.activity = activity;
      //  this.minutes = minutes;
        //this.date = date;
    //}
    
}

//a. Create a FitnessTracker class that includes data fields for a fitness activity, 
//the number of minutes spent participating, and the date. The class includes methods 
//to get each field. In addition, create a default constructor that automatically sets 
//the activity to “running,” the minutes to 0, and the date to January 1 of the current year. 
//Save the file as FitnessTracker.java. Create an application that demonstrates each method 
//works correctly, and save it as FitnessTracker.java.
//b. Create an additional overloaded constructor for the FitnessTracker class you created 
//in Exercise 3a. This constructor receives parameters for each of the data fields and assigns 
//them appropriately. Add any needed statements to the FitnessTracker application to ensure 
//that the overloaded constructor works correctly save it, and then test it.
//c. Modify the FitnessTracker class so that the default constructor calls the three-parameter 
//constructor. Save the class as FitnessTracker2.java. Create an application to test the new 
//version of the class, and name it TestFitnessTracker2.java.