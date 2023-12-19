/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chp13_class1;

/**
 *
 * @author wingki
 */
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class WriteStudentfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("/Users/wingki/Library/CloudStorage/Box-Box/IS6615 Data Structure & Java 2/Exercises/Students.txt");
        String s = "";
        String delimiter = ",";
        int studentId;
        String studentName;
        double grade;
        final int QUIT = 999;
        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.println("Enter student id number");
            studentId = input.nextInt();
            while(studentId != QUIT)
            {
                System.out.println("Enter name of student");
                input.nextLine();
                studentName = input.nextLine();
                System.out.println("Enter grade");
                grade = input.nextDouble();
                s = studentId + delimiter + studentName + delimiter + grade;
                writer.write(s,0,s.length());
                writer.newLine();
                System.out.println("Enter student id number or " + QUIT + " to quit");
                studentId = input.nextInt();
            }
            writer.close();
        }
        
        catch(Exception e)
        {
            System.out.println("Error has occured in writing to file " + e);
        }
        
    }
    
}
