package stringexample;

/**
 *
 * @author adlawancc
 */
public class StringExample {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        
    //concatenate two strings
    String s3 = s1 + " " + s2;
    
    //convert string to uppercase
    String s4 = s3.toUpperCase();
    System.out.println("s4: " + s4);
    
    //check if string contains a substring
    boolean contains = s3.contains("world");
    System.out.println("s3 contains 'world': " + contains);
    
    //get the length of a string
    int length = s3.length();
    System.out.println("Length of s3: " + length);
    
    //get a substring
    String s5 = s3.substring(0, 5);
    System.out.println("S5: " + s5);
    
    //second example
    
   
    
    }
    
}
