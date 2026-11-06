package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Fundamentals;

import java.util.Scanner;

public class Greatest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Greatest of three is "+a);
        } else if (b>a && b>c) {
            System.out.println("Greatest of three is "+b);
        }
        else{
            System.out.println("Greatest of three is "+c);
        }
    }
}
