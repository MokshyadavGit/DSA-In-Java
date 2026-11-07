package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

import java.util.Scanner;

public class Remove_All_Spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                result  += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}