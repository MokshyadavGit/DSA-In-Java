package JavaFoundationsForDSA.PatternPrinting;

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        printStar(n);
    }

    public static void printStar (int n) {
        for(int i=0;i<n;i++){
            //Spaces
            for(int j=1;j<=(n-i-1);j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=(2*i)+1;j++){
                System.out.print("*");
            }
            //Spaces
            for(int j=1;j<=(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
