/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stu_app;

/**
 *
 * @author wingki
 */
public class stu {
    private int uid;
    private String firstName;
    private String lastName;
    private String grade;
    private float tuition;
    
    public int getUid()
    {
        return uid;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getGrade()
    {
        return grade;
    }
    public float getTuition()
    {
        return tuition;
    }
    
    public void setUid(int studentId)
    {
        uid = studentId;
    }
    public void setFirstName(String first_name)
    {
        firstName = first_name;
    }
    public void setLastName(String last_name)
    {
        this.lastName = lastName;
    }
    public void setGrade(String grd)
    {
        this.grade = grd;
    }
    public void setTuition(float fee)
    {
        this.tuition = fee;
    }
    public void setStu(int id, String first_name, String last_name, String grade, float fee)
    {
        uid = id;
        firstName = first_name;
        lastName = last_name;
        this.grade = grade;
        tuition = fee;
    }
}
