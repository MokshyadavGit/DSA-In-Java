package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Fundamentals;

import java.util.Scanner;

public class positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Zero");
        } else if (n>0) {
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }
    }
}
