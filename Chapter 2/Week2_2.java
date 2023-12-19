/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2_2;

import javax.swing.JOptionPane;
        
/**
 *
 * @author wingki yu
 */
public class Week2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String value1;
        String value2;
        value1 = JOptionPane.showInputDialog(null, "What do you want to say?");
        JOptionPane.showMessageDialog(null, "I want to say " + value1);
        value2 = JOptionPane.showInputDialog(null, "Please enter the number of days");
        int result = Integer.parseInt(value2);
        System.out.println(result);
    }
    
}
