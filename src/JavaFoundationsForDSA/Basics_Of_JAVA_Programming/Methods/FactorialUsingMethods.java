package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Methods;

import java.util.Scanner;

public class FactorialUsingMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=input.nextInt();
        factorial(n);
    }

    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
