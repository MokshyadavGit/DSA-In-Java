package JavaFoundationsForDSA.Methods;

import java.util.Scanner;

public class CountDigitisInNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        counting(n);
    }

    public static void counting(int n) {
        int count =0;
        int r;
        for(int i=1;n!=0;i++){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
