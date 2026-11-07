package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

import java.util.Scanner;

public class Count_Vowel_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();                                 //Input from user
        str = str.toLowerCase();                                //String ko lowercase mai convert kra
        int n= str.length();                                    //String ki length li
        char ch;
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<n;i++){                                   //Yeh index ke liye loop run ho rha hai
            ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                if(ch =='a'|| ch =='e' || ch == 'i'|| ch =='o'|| ch =='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
