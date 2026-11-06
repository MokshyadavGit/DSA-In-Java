package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.PatternPrinting;

import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        print1(n);
    }
    public static void print1 (int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
