package JavaFoundationsForDSA.Methods;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not : ");
        int n = input.nextInt();
        Isprime(n);
    }

    public static void Isprime(int n) {
        if(n==1) {
            System.out.println("Neither prime nor prime");
            return;
        }
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime number");
    }
}