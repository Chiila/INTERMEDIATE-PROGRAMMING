/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewriterexample;

/**
 *
 * @author adlawancc
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "C:/JavaFiles/example.txt";
        try {
            FileWriter writer = new FileWriter (fileName);
            writer.write ("This is an example text file. \n");
            writer.write ("This is a second line of text.");
            writer.close();
            System.out.println("File created: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occured.");
        }
    }    
}