/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathTest;

/**
 *
 * @author wingki
 */

public class Math {

    private double sqrt, sine, cosine, floor, ceiling, round, randomn;
    private char largeChar, smallChar;
    private int largeInt, smallInt;
    
    public void setSqrt(int a)
    {
        this.sqrt = java.lang.Math.sqrt(a);
        System.out.println("Square root of " + a + " is " + sqrt);
    }
    public double getSqrt()
    {
        return sqrt;
    }
    public void setSine(int b)
    {
        this.sine = java.lang.Math.sin(b);
        System.out.println("Sine of " + b + " is " + sine);
        this.cosine = java.lang.Math.cos(b);
        System.out.println("Cosine of " + b + " is " + cosine);
    }
    public double getSine()
    {
        return sine;
    }
    public double getCosine()
    {
        return cosine;
    }
    public void setFcr(double c)
    {
        this.floor = java.lang.Math.floor(c);
        System.out.println("Floor of " + c + " is " + floor);
        this.ceiling = java.lang.Math.ceil(c);
        System.out.println("Ceiling of " + c + " is " + ceiling);
        this.round = java.lang.Math.round(c);
        System.out.println("Round of " + c + " is " + round);
    }
    public double getFloor()
    {
        return floor;
    }
    public double getCeiling()
    {
        return ceiling;
    }
    public double getRound()
    {
        return round;
    }
    public void setLs(char d, int e)
    {
        this.largeChar = (char) (d + 1);
        this.smallChar = (char) (d - 1);
        System.out.println("Characters larger and smaller than " + d + " are " + largeChar + " and " + smallChar);
        this.largeInt = (char) (e + 1);
        this.smallInt = (char) (e - 1);
        System.out.println("Characters larger and smaller than " + e + " are " + largeInt + " and " + smallInt);
        this.randomn = java.lang.Math.random()*20;
        System.out.println("Random number between 0 and " + e + " is " + randomn);
    }
    public char getLC()
    {
        return largeChar;
    }
    public char getSC()
    {
        return smallChar;
    }
    public int getLN()
    {
        return largeInt;
    }
    public int getSN()
    {
        return smallInt;
    }
    public double getRandom()
    {
        return randomn;
    }
}

//Write a Java application that uses the Math class to determine the answers for 
//each of the following:
//a. The square root of 37
//b. The sine and cosine of 300
//c. The value of the floor, ceiling, and round of 22.8
//d. The larger and the smaller of the character ‘D’ and the integer 71
//e. A random number between 0 and 20 (Hint: The random() method returns a value 
//between 0 and 1; you want a number that is 20 times larger.)
//Save the application as MathTest.java.