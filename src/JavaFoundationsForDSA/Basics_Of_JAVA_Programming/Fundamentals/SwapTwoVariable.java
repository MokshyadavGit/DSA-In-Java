package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Fundamentals;

import java.util.Scanner;

public class SwapTwoVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number in a");
        int a = input.nextInt();
        System.out.println("Enter the second number in b");
        int b = input.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swaping two numbers is: " + a + " " + b);
        System.out.println(a);
        System.out.println(b);
    }
}
