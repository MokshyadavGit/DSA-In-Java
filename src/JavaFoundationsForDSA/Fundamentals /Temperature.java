package JavaFoundationsForDSA.Fundamentals;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        int celcius_temperature = sc.nextInt();
        int fahrenheit_temperature = (celcius_temperature * 9/5) + 32;
        System.out.println("Fahrenheit temperature is: " + fahrenheit_temperature);
    }
}