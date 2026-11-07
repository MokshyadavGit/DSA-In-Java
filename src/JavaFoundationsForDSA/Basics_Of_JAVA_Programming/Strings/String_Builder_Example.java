package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

public class String_Builder_Example {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Moksh");
        //This is mutable - means original string change ho skti h but make sure
        //String objects are immutable bcoz they can't change their original string
        s.append(" Yadav");
        System.out.println(s);
    }
}