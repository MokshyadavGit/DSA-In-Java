package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

import java.util.Scanner;

public class Count_Spaces_And_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = scanner.nextLine();
        int spaces = 0;
        int words = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                spaces++;
            }
            if(text.charAt(i) != ' '){
                words++;
            }
        }
        System.out.println("The number of spaces are: " + spaces);
        System.out.println("The number of words are: " + words);
    }
}
