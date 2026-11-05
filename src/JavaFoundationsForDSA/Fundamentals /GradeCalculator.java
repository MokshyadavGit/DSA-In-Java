package JavaFoundationsForDSA.Fundamentals;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of a student: ");
        int marks = input.nextInt();
        if(marks>=90){
            System.out.println("A Grade.");
        } else if (marks>=80) {
            System.out.println("B Grade.");
        }
        else{
            System.out.println("C Grade.");
        }
    }
}
