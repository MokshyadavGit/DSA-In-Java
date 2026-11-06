package JavaFoundationsForDSA.Basics_Of_JAVA_Programming.ClassesandObjects;

public class Student {
    String name;
    int age;
    int marks;

    public void study() {
        System.out.println( name+ " is studying");
    }
    public static void main(String[] args) {

        //Create first object
        Student S1 = new Student();
        S1.name = "MOKSH";
        S1.age = 18;
        S1.marks = 100;

        //Create second object
        Student S2 = new Student();
        S2.name = "Ankit";
        S2.age = 19;
        S2.marks = 90;

        S1.study();
        S2.study();
    }
}
