/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4_12;

/**
 *
 * @author wingki
 */
public class Population {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mex = 121;
        double us = 315;
        int years = 0;
        System.out.println("The population of Mexico is now " + mex + " million and that of the United States is now " + us + " million.");
        String suffix;
        
        if(mex <= us)
        {
            while(mex <= us)
            {
                mex *= 1.0101;
                us *= 0.9985;
                years ++;
                if(years >= 4)
                    suffix = "th";
                else
                    if(years == 3)
                        suffix = "rd";
                    else
                        if(years == 2)
                            suffix = "nd";
                         else
                            suffix = "st";
                System.out.println("On the " + years + suffix + " year, the population of Mexico will be " 
                        + mex + " million and that of the United States will be " + us + " million.");
            }
        }
        else
            System.out.println("It will take " + years + "of years for the population of Mexico (" 
                        + mex + " million) to exceed that of the United States (" + us + " million).");
    }
    
}

//Assume that the population of Mexico is 121 million and that the population 
//increases 1.01 percent annually. Assume that the population of the United 
//States is 315 million and that the population is reduced 0.15 percent annually. 
//Write an application that displays the populations for the two countries every 
//year until the population of Mexico exceeds that of the United States, and 
//display the number of years it took. Save the file as Population.java