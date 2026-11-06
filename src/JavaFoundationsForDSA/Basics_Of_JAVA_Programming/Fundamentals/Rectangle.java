package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Fundamentals;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the width of the rectangle");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = (length + width) * 2;
        System.out.println("Area of the rectangle is "+ area);
        System.out.println("Perimeter of the rectangle is "+perimeter);
    }
}
