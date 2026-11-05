package JavaFoundationsForDSA.Fundamentals;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double SI;
        System.out.println("Enter the principal amount");
        double P = input.nextDouble();
        System.out.println("Enter the rate in integral form");
        double R = input.nextDouble();
        System.out.println("Enter the time line in year format");
        double T = input.nextDouble();
        SI = (P*R*T)/100;
        System.out.println("The simple intrest is: " + SI);
    }
}
