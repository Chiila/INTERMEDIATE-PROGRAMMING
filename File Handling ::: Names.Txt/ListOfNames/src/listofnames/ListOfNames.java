package listofnames;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author adlawancc
 */
public class ListOfNames {
    public static void data (){
     String fileName = "C:/Lists/names.txt";
     Scanner in = new Scanner (System.in);

        try {
            FileWriter writer = new FileWriter (fileName, true);
            while (true) {
            String list = in.nextLine();
            if(list.equalsIgnoreCase("quit")){
                writer.close();
                break;
            }
            writer.write (list + "\n");
            }
            System.out.println("File created: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occured.");
        }
}
    public static void main(String[] args) {
        ListOfNames n = new ListOfNames();
        n.data();
    }    
}