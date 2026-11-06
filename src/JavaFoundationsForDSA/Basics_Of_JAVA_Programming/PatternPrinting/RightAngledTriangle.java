package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.PatternPrinting;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rtriangle(n);
    }

    public static void Rtriangle (int n) {
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
