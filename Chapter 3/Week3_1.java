/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3_1;

/**
 *
 * @author wingki yu
 */
public class Week3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = 2.0;
        double num2 = 5.0;
        double result;
        result = computePercent(num1, num2);
        System.out.println(num1 + " is " + result + "% of " + num2);
        result = computePercent(num2, num1);
        System.out.println(num2 + " is " + result + "% of " + num1);
    }

    private static double computePercent(double x, double y) {
        //System.out.println(x + " is " + (x/y)*100 + "% of " + y);
        double result;
        result = (x/y)*100;
        return result;
    }
    
}
