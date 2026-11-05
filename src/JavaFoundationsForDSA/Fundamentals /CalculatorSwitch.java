package JavaFoundationsForDSA.Fundamentals;
import java.util.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the operation -> +,-,*,/");
        char operation = input.next().charAt(0);
        switch(operation){
            case '+':
        System.out.println(num1 + num2);
        break;
            case '-':
        System.out.println(num1 - num2);
        break;
            case '*':
        System.out.println(num1 * num2);
        break;
            case '/':
        if(num2!=0){
            System.out.println(num2 / num1);
        }
        else {
            System.out.println("Invalid Operation");
        }
        break;
        }
    }
}
