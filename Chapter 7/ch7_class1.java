/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_class1;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class ch7_class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = new int[10];
        int score = 0;
        int count = 0;
        int total = 0;
        final int QUIT = 999;
        final int MAX = 10;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter quiz score or " + QUIT + " to quit >>");
        
        score = input.nextInt();
        
        while(score != QUIT)
        {
            scores[count] = score;
            total = total + scores[count];
            ++count; // count = count + 1
            if(count == MAX)
            {
                score = QUIT;
            }
            else
            {
                System.out.println("Enter quiz score or " + QUIT + " to quit >>");
                score = input.nextInt();
            }
        }
        
        for(int x = 0; x < count; ++x)
        {
            System.out.print(scores[x] + " ");
            if(count != 0)
            {
                System.out.println("\n The average is " + (total * 1.0/count)); // divide 1.0 to make it double, unless the return will be rounded
            }
            else
            {
                System.out.println("No scores were entered");
            }
        }
    }
    
}
