/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chp10_class2;

/**
 *
 * @author wingki
 */
public class CabinRental {
    private int cabinNumber;
    protected double rate;
    final int CUTOFF = 4;
    final double LOWRATE = 950;
    final double HIGHRATE = 1100;
    public CabinRental(int num)
    {
        cabinNumber = num;
        if(cabinNumber < CUTOFF)
        {
            rate = LOWRATE;
        }
        else
        {
            rate = HIGHRATE;
        }
    }
    public int getCabinNumber()
    {
        return cabinNumber;
    }
    public double getRate()
    {
        return rate;
    }
}
