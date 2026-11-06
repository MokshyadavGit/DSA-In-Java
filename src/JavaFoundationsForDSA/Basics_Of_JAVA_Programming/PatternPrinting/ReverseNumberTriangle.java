package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.PatternPrinting;

import java.util.Scanner;

public class ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printpattern(n);
    }

    public static void printpattern(int n) {
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
