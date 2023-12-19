/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testfitnesstracker_main;

import java.time.LocalDate;

/**
 *
 * @author wingki
 */
public class TestFitnessTracker2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String activity = null;
        int minutes = 0;
        LocalDate date = null;
            
        FitnessTracker tracker3 = new FitnessTracker("Walking", 45, LocalDate.of(2023, 10, 8));
        
        System.out.println("Current activity: " + tracker3.getActivity());
        System.out.println("Current minutes spent participating: " + tracker3.getMinutes());
        System.out.println("Current date: " + tracker3.getDate());
    }
    
}

