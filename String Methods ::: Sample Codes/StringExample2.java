package stringexample;

/**
 *
 * @author adlawancc
 */
public class StringExample2 {
        public static void main(String[] args) {
    
     String str1 = "Hello, World!";
    String str2 = " Welcome to Java!";
    
    //length() method
    int length1 = str1.length();
    System.out.println("Length of str1: " + length1);
    
    //charAt() method
    char firstChar = str1.charAt(0);
    System.out.println("First character of str1: " + firstChar);
    
    //substring() method
    String substring1 = str1.substring(7);
    System.out.println("Substring of str1 starting at index 7: " + substring1);
    
    //toUpperCase() method
    String upperCase1 = str1.toUpperCase();
    System.out.println("Uppercase version of str1: " + upperCase1);
    
    //toLowerCase() method
    String lowerCase2 = str2.toLowerCase();
    System.out.println("Lowercase version of str2: " + lowerCase2);
    
    //trim() method
    String trimmed2 = str2.trim();
    System.out.println("Trimmed version of str2: " + trimmed2);  
    
    //replace() method
    String replaced1 = str1.replace("World", "Java");
    System.out.println("Replacement of 'World' with 'Java'in str1: " + replaced1);
        
    //indexOf() method
    int index2 = str2.indexOf("Java");
    System.out.println("Index of 'Java'in str2: " + index2);
    }
}