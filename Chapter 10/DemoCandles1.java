/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chp10_class1;

/**
 *
 * @author wingki
 */
public class DemoCandles1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candle candle1 = new Candle();
        ScentedCandle scentedCandle1 = new ScentedCandle();
        candle1.setColor("pink");
        candle1.setHeight(6);
        scentedCandle1.setColor("white");
        scentedCandle1.setScent("gardinia");
        scentedCandle1.setHeight(6);
        System.out.println("The " + candle1.getHeight() + " inch " +
                candle1.getColor() + " candle costs $" + candle1.getPrice());
        System.out.println("The " + scentedCandle1.getHeight() + " inch " +
                scentedCandle1.getScent() + " " + scentedCandle1.getColor() + 
                " candle costs $" + scentedCandle1.getPrice());
    }
    
}
