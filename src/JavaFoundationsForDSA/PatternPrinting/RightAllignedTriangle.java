package JavaFoundationsForDSA.PatternPrinting;

import java.util.Scanner;

public class RightAllignedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n) {
        for(int i=1;i<=n;i++){
            //Spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
