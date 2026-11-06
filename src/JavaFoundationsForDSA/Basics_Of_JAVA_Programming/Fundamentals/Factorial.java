package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Fundamentals;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        if (n==0)
        {
            System.out.println("Factorial is 1");
        }
        else
        {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}