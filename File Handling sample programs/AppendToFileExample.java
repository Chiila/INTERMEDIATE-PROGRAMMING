/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appendtofileexample;

/**
 *
 * @author adlawancc
 */
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        String fileName = "C:/Lists/names.txt";
        String textToAppend = "This is a new line of text to append.";
        
        try {
            FileWriter writer = new FileWriter (fileName, true);
            writer.write (textToAppend + "\n");
            writer.close();
            System.out.println("Text to append to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}