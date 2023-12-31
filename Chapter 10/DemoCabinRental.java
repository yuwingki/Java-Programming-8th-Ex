/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chp10_class2;

/**
 *
 * @author wingki
 */
public class DemoCabinRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CabinRental lowCabin = new CabinRental(2);
        CabinRental highCabin = new CabinRental(4);
        HolidayCabinRental lowHolidayRental = new HolidayCabinRental(2);
        HolidayCabinRental highHolidayRental = new HolidayCabinRental(4);
        System.out.println("Low cabin #" + lowCabin.getCabinNumber() + 
                " rate " + lowCabin.getRate());
        System.out.println("High cabin #" + highCabin.getCabinNumber() + 
                " rate " + highCabin.getRate());
        System.out.println("Low holiday #" + lowHolidayRental.getCabinNumber() + 
                " rate " + lowHolidayRental.getRate());
        System.out.println("High holiday #" + highHolidayRental.getCabinNumber() + 
                " rate " + highHolidayRental.getRate());
    }
    
}
