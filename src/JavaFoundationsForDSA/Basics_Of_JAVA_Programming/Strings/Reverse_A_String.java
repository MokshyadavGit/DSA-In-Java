package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

import java.util.Scanner;

public class Reverse_A_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n = str.length();
        String reversed_string = " ";
        for(int i=n-1;i>=0;i--){
            reversed_string += str.charAt(i);
        }
        System.out.println(reversed_string);
    }
}