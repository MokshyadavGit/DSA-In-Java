package JavaFoundationsForDSA.PatternPrinting;

import java.util.Scanner;

public class NumberTriangle_One {
    public static void main(String[] args) {
        NTriangle();
    }
    public static void NTriangle() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
