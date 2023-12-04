package shapes;
import java.util.Scanner;

public class Shapes {

    static Scanner sc = new Scanner(System.in);
    public static void squarePerimeterArea() {
        System.out.println("Enter square side: ");
        double side = sc.nextDouble();
        System.out.println("Square perimeter = " + (side * 4));
        System.out.println("Square area = " + (side * side));
    }

    public static void rectanglePerimeterArea() {
        System.out.println("Enter rectangle length: ");
        double length = sc.nextDouble();
        System.out.println("Enter rectangle width: ");
        double width = sc.nextDouble();
        System.out.println("Rectangle perimeter = " + ((length + width) * 2));
        System.out.println("Rectangle area = " + (length * width));
    }

    public static void trianglePerimeterArea() {
        System.out.println("Enter traingle a: ");
        double a = sc.nextDouble();
        System.out.println("Enter traingle b: ");
        double base = sc.nextDouble();
        System.out.println("Enter traingle c: ");
        double c = sc.nextDouble();
        System.out.println("Enter traingle height: ");
        double height = sc.nextDouble();
        System.out.println("Traingle Perimeter =" + (a + base + c));
        System.out.println("Traingle Area =" + (base * height) / 2);
    }

    public static void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("AREA and PERIMETER");
        System.out.println("COMPUTATION");
        System.out.println("[1] - Square");
        System.out.println("[2] - Rectangle");
        System.out.println("[3] - Triangle");
        System.out.println("[0] - Exit");

        String input = sc.next();
        if (input.equals("0")) {
            System.exit(0);
        }
        else if (input.equals("1")) {
            squarePerimeterArea();
            start();
        }
        else if (input.equals("2")) {
            rectanglePerimeterArea();
            start();
        }
        else if (input.equals("3")) {
            trianglePerimeterArea();
            start();
        }
        else {
            System.out.println("Wrong Input.");
            start();
        }
    }
    
    public static void main(String[] args) {
        Shapes.start();
     
    }
    
}
