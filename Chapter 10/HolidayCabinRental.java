/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chp10_class2;

/**
 *
 * @author wingki
 */
public class HolidayCabinRental extends CabinRental
{
    public HolidayCabinRental(int num)
    {
        super(num);
        final int SURCHARGE = 150;
        rate += SURCHARGE;
    }
}
