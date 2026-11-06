package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Fundamentals;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        int diff = n1 - n2;
        int product = n1 * n2;
        int div = n1 / n2;
        int remainder = n1 % n2;
        System.out.println("Sum is: " + sum);
        System.out.println("Diff is: " + diff);
        System.out.println("Product is: " + product);
        System.out.println("Div is: " + div);
        System.out.println("Remainder is: " + remainder);
    }
}