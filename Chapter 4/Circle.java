/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle_main;

/**
 *
 * @author wingki
 */
public class Circle {
    private double radius, diameter, area;
    
    public void setRadius()
    {
        radius = 1;
        diameter = radius * 2;
        double π;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the Circle = " + area);
    }
    public void setRadius(double a)
    {
        radius = a;
        diameter = radius * 2;
        double π;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the Circle = " + area);
    }
    public double getRadius()
    {
        return radius;
    }
}

//a. Create a class named Circle with fields named radius, diameter, and area. Include a 
//constructor that sets the radius to 1 and calculates the other two values. Also include 
//methods named setRadius() and getRadius(). The setRadius() method not only sets the radius, 
//it also calculates the other two values. (The diameter of a circle is twice the radius, and 
//the area of a circle is pi multiplied by the square of the radius. Use the Math class PI 
//constant for this calculation.) Save the class as Circle.java.
//b. Create a class named TestCircle whose main() method declares several Circle objects. 
//Using the setRadius() method, assign one Circle a small radius value, and assign another a 
//larger radius value. Do not assign a value to the radius of the third circle; instead, retain 
//the value assigned at construction. Display all the values for all the Circle objects. Save 
//the application as TestCircle.java.