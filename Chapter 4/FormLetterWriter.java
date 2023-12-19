/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formletterwriter;

/**
 *
 * @author wingki
 */
public class FormLetterWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lastName = "Smith";
        String firstName = "Beth";
        
        flw_class writer1 = new flw_class();
        
        writer1.displaySalutation(lastName);
        writer1.displaySalutation(lastName, firstName);
        System.out.println("Thank you for your recent order.");
    }
            
}
