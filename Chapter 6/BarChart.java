/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw4_13;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int aliPoints;
        int bobPoints;
        int caiPoints;
        int danPoints;
        int eliPoints;
        System.out.print("Enter Points earned by Ali: ");
        aliPoints = input.nextInt();
        System.out.print("Enter Points earned by Bob: ");
        bobPoints = input.nextInt();
        System.out.print("Enter Points earned by Cai: ");
        caiPoints = input.nextInt();
        System.out.print("Enter Points earned by Dan: ");
        danPoints = input.nextInt();
        System.out.print("Enter Points earned by Eli: ");
        eliPoints = input.nextInt();
        System.out.print("\n Points for Game\n");
        drawChart("Ali", aliPoints);
        drawChart("Bob", bobPoints);
        drawChart("Cai", caiPoints);
        drawChart("Dan", danPoints);
        drawChart("Eli", eliPoints);
    }

    private static void drawChart(String name, int points) {
        System.out.print(name + " ");
        for(int x = 0; x < points; ++x)
            System.out.print("*");
        System.out.println();
    }
    
}
//The Huntington High School basketball team has five players named Art, Bob, 
//Cal, Dan, and Eli. Accept the number of points scored by each player in a game 
//and create a bar chart that illustrates the points scored, similar to the chart 
//in Figure 6-35. Save the file as BarChart.java.