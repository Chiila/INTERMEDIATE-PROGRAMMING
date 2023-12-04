package openprob;
import java.util.Scanner;
public class OpenProb {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Read numbers: ");
         
        int[] numbers = new int [100];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println(" ");
        
        double Total = 0;
        double Average = 0;
        for(int i = 0; i < numbers.length; i++){
            Total += numbers[i];
        }
        Average = Total/numbers.length;
        System.out.println("AVERAGE: " + Average);
        
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > Average){
            count ++;
            }
        }
        System.out.println("ABOVE AVERAGE: " + count);
    }
}