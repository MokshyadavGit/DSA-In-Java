package JavaFoundationsForDSA.PatternPrinting;

import java.util.Scanner;

public class CubePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        pattern(n);
    }
    public static void pattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
