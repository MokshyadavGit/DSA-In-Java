package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

import java.util.Scanner;

public class Functions_Of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();                                   //Taking input as string literal
        System.out.println(s.charAt(0));                        //Character at the index
        System.out.println(s.length());                         //Length of the string
        System.out.println(s.toUpperCase());                    //Change the string to upper case
        System.out.println(s.toLowerCase());                    //Change the string to lower case
        System.out.println(s.substring(1,4));                   //Gives the substring from the index 1 to 4
        System.out.println(s.contains("ok"));                   //Checks the text in the string
        System.out.println(s.equals("Moksh"));                  //Compares content
        System.out.println(s.indexOf("ok"));                    //Checks the first index
        System.out.println(s.lastIndexOf("o"));             //Checks the last occurring index
        System.out.println(s.trim());                           //Removes outer spaces
    }
}
