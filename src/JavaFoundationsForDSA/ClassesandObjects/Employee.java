package JavaFoundationsForDSA.ClassesandObjects;

public class Employee {
    String name;
    int salary;
    String department;

    public static void main(String[] args) {

        //Creating first employee
        Employee e1 = new Employee();
        e1.name = "MOKSH";
        e1.salary = 20000;
        e1.department = "SDE";

        //Creating second employee
        Employee e2 = new Employee();
        e2.name = "Mayank";
        e2.salary = 15000;
        e2.department = "WEBDev";
    }
}
