/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chp10_class1;

/**
 *
 * @author wingki
 */
public class ScentedCandle extends Candle
{
    private String scent;
    public String getScent()
    {
        return scent;
    }
    public void setScent(String scent)
    {
        this.scent = scent;
    }
    @Override
    public void setHeight(int h)
    {
        final double PER_INCH = 3;
        super.setHeight(h);
        price = h * PER_INCH;
    }
}
