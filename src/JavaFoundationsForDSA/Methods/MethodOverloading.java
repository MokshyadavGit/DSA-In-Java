package JavaFoundationsForDSA.Methods;

public class MethodOverloading {
    public static void main(String[] args) {
        add(10,20);
        add(10.3,10.8);
        add(1,2,3);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }
}