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
public class TestFitnessTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String activity = null;
        int minutes = 0;
        LocalDate date = null;
        
        FitnessTracker tracker1 = new FitnessTracker();
        
        System.out.println("Default activity: " + tracker1.getActivity());
        System.out.println("Default minutes spent participating: " + tracker1.getMinutes());
        System.out.println("Default date: " + tracker1.getDate());
        
        FitnessTracker tracker2 = new FitnessTracker("Hiking", 60, LocalDate.of(2023, 10, 8));
        
        System.out.println("Current activity: " + tracker2.getActivity());
        System.out.println("Current minutes spent participating: " + tracker2.getMinutes());
        System.out.println("Current date: " + tracker2.getDate());
    }
    
}

