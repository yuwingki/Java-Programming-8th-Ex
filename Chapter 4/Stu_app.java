/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Stu_app;

import java.util.Scanner;

/**
 *
 * @author wingki
 */
public class Stu_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int uid;
        String first_name;
        String last_name;
        String grade;
        float tuition;
        
        stu student1 = new stu();
        stu student2 = new stu();
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter uid");
        uid = kb.nextInt();
        System.out.println("Please enter your first name");
        kb.nextLine();
        first_name = kb.nextLine();
        System.out.println("Please enter your last name");
        last_name = kb.nextLine();
        System.out.println("Please enter your grade");
        grade = kb.nextLine();
        System.out.println("Please enter your tuition");
        tuition = kb.nextFloat();
        
        student1.setStu(uid, first_name, last_name, grade, tuition);
        //student1.setUid(kb.nextInt());
        
        System.out.println("The student id is " + student1.getUid());
        System.out.println("The student first name is " + student1.getFirstName());
        System.out.println("The student last name is " + student1.getLastName());
        System.out.println("The student grade is " + student1.getGrade());
        System.out.println("The student tuition is " + student1.getTuition());
    }
    
}
