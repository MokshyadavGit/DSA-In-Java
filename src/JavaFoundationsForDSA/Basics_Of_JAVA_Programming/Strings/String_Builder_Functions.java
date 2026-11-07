package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.Strings;

public class String_Builder_Functions {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Moksh");
        System.out.println(s.append(" Yadav"));
        System.out.println(s.insert(11, " ,is a nice person"));
        System.out.println(s.deleteCharAt(5));
        System.out.println(s.reverse());
        System.out.println(s.replace(1,4,"esh"));
        System.out.println(s.charAt(2));
        System.out.println(s.length());
    }
}
