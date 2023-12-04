/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.Scanner;
public class Students {

    String studentNumber;
    String Name;
    String Course;
    String Year;
    
    void getStudentDetails(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Student Number: ");
        studentNumber = sc.nextLine();
        System.out.println("Enter Name: ");
        Name = sc.nextLine();
        System.out.println("Enter Course: ");
        Course = sc.nextLine();
        System.out.println("Enter Year: ");
        Year = sc.nextLine();
    }
    
    void showStudentDetails(){
        System.out.println("Student Number: "+ studentNumber);
        System.out.println("Student Name: "+ Name);
        System.out.println("Student Course: "+ Course);
        System.out.println("Student Year: "+ Year);
    }
            
    public static void main(String[] args) {
        Students s = new Students();
        
        s.getStudentDetails();
        System.out.println(" ");
        s.showStudentDetails();
    }
    
}
