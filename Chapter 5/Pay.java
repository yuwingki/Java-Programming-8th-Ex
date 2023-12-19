/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3_6;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Pay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double payrate, regularpay, overtime, deduction, netpay, totaldeduction;        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the skill level: ");
        int skill = input.nextInt();
        System.out.print("Enter the hours worked: ");
        int workinghours = input.nextInt();
        
        if (skill == 1)
        {
            payrate = 17;
            if (workinghours <= 40)
            {
                regularpay = payrate * workinghours;
                System.out.println("Hours worked: " + workinghours); 
                System.out.println("Hourly pay rate: $" + payrate); 
                System.out.println("Regular pay (40 hours): $" + regularpay);
            }
            else
            {
                regularpay = payrate * 40;
                overtime = payrate * (workinghours-40)*1.5;
                System.out.println("Hours worked: " + workinghours); 
                System.out.println("Hourly pay rate: $" + payrate); 
                System.out.println("Regular pay (40 hours): $" + (payrate * 40));
                System.out.println("Overtime pay: $" + overtime); 
                System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
            }
        }
        else if (skill == 2 || skill == 3)
        {
            System.out.print("Enter insurance option (1:Medical, 2:Dental, 3:Long-term disability): ");
            int insurance = input.nextInt();
            switch (insurance) {
                case 1 -> {
                    deduction = 32.5;
                    if (skill == 2)
                    {
                        payrate = 20;
                        if (workinghours <= 40)
                        {
                            regularpay = payrate * workinghours;
                            netpay = (regularpay-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + deduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            netpay = (regularpay+overtime-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate); 
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime); 
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + deduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                    }
                    else if (skill == 3)
                    {
                        payrate = 22;
                        System.out.print("Did you elect to participate in the retirement plan (true/false): ");
                        boolean retirement = input.nextBoolean();
                        if (workinghours <= 40 && retirement == true)
                        {
                            regularpay = payrate * workinghours;
                            totaldeduction = deduction + regularpay*0.03;
                            netpay = (regularpay-totaldeduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + totaldeduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else if (workinghours > 40 && retirement == true)
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            totaldeduction = deduction + (regularpay + overtime)*0.03;
                            netpay = (regularpay+ overtime-totaldeduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime);
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + totaldeduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                        else if (workinghours <= 40 && retirement == false)
                        {
                            regularpay = payrate * workinghours;
                            netpay = (regularpay-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + deduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else if (workinghours > 40 && retirement == false)
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            netpay = (regularpay+ overtime-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime);
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + deduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                    }
                }
                case 2 -> {
                    deduction = 20;
                    if (skill == 2)
                    {
                        payrate = 20;
                        if (workinghours <= 40)
                        {
                            regularpay = payrate * workinghours;
                            netpay = (regularpay-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + deduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            netpay = (regularpay+overtime-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate); 
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime); 
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + deduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                    }
                    else if (skill == 3)
                    {
                        payrate = 22;
                        System.out.print("Did you elect to participate in the retirement plan (true/false): ");
                        boolean retirement = input.nextBoolean();
                        if (workinghours <= 40 && retirement == true)
                        {
                            regularpay = payrate * workinghours;
                            totaldeduction = deduction + regularpay*0.03;
                            netpay = (regularpay-totaldeduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + totaldeduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else if (workinghours > 40 && retirement == true)
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            totaldeduction = deduction + (regularpay + overtime)*0.03;
                            netpay = (regularpay+ overtime-totaldeduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime);
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + totaldeduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                        else if (workinghours <= 40 && retirement == false)
                        {
                            regularpay = payrate * workinghours;
                            netpay = (regularpay-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + deduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else if (workinghours > 40 && retirement == false)
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            netpay = (regularpay+ overtime-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime);
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + deduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                    }
                }
                case 3 -> {
                    deduction = 10;
                    if (skill == 2)
                    {
                        payrate = 20;
                        if (workinghours <= 40)
                        {
                            regularpay = payrate * workinghours;
                            netpay = (regularpay-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + deduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            netpay = (regularpay+overtime-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate); 
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime); 
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + deduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                    }
                    else if (skill == 3)
                    {
                        payrate = 22;
                        System.out.print("Did you elect to participate in the retirement plan (true/false): ");
                        boolean retirement = input.nextBoolean();
                        if (workinghours <= 40 && retirement == true)
                        {
                            regularpay = payrate * workinghours;
                            totaldeduction = deduction + regularpay*0.03;
                            netpay = (regularpay-totaldeduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + totaldeduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else if (workinghours > 40 && retirement == true)
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            totaldeduction = deduction + (regularpay + overtime)*0.03;
                            netpay = (regularpay+ overtime-totaldeduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime);
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + totaldeduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                        else if (workinghours <= 40 && retirement == false)
                        {
                            regularpay = payrate * workinghours;
                            netpay = (regularpay-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Total deductions: $" + deduction);
                            if (netpay > 0)
                                System.out.println("Net pay is $" + netpay);
                            else
                                System.out.println("Error: Deductions exceed gross pay");
                        }
                        else if (workinghours > 40 && retirement == false)
                        {
                            regularpay = payrate * 40;
                            overtime = payrate * (workinghours-40)*1.5;
                            netpay = (regularpay+ overtime-deduction);
                            System.out.println("Hours worked: " + workinghours);
                            System.out.println("Hourly pay rate: $" + payrate);
                            System.out.println("Regular pay (40 hours): $" + regularpay);
                            System.out.println("Overtime pay: $" + overtime);
                            System.out.println("Total pay (regular + overtime): $" + (regularpay+overtime));
                            System.out.println("Total deductions: $" + deduction);
                            System.out.println("Net pay is $" + netpay);
                        }
                    }
                }
            }
        }
    }
}
