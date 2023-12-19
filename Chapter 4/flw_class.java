/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formletterwriter;

/**
 *
 * @author wingki
 */
public class flw_class {
    private String firstName;
    private String lastName;
    
    public String getLastName()
    {
        return lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void displaySalutation(String lastName)
    {
        this.lastName = lastName;
        System.out.println("Dear Mr. or Ms. " + lastName);
    }
    public void displaySalutation(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        System.out.println("Dear " + firstName + " " + lastName);
    }
}
