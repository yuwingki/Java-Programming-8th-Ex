/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_class1;

/**
 *
 * @author wingki
 */
public class Ch8_class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;
        int value = 1;
        
        int[][] student_score = new int [rows][columns];
        
        for(int i = 0; i < rows; ++i)
        {
            for(int j = 0; j < columns; ++j)
            {
                student_score[i][j] = value;
                value++;
            }
        }
        
        System.out.println("The value of my 2D array");
        
        for(int i = 0; i < rows; ++i)
        {
            for(int j = 0; j < columns; ++j)
            {
                System.out.print(student_score[i][j]);
            }
            
            System.out.println();
        }
    }
    
}
