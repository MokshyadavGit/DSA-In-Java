package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toUpperCase();
        String original=str;
        int len=str.length();
        String reversed = "";
        for(int i=len-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        if(original.equals(reversed)){
            System.out.println("Yes, it is a palindrome");
        }
        else{
            System.out.println("No, it is a palindrome");
        }
    }
}
