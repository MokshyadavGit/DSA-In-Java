package JavaFoundationsForDSA.ClassesandObjects;

public class Car {
    String brand;
    char Model;
    int speed;
    public void display()
    {
        System.out.println( "Car brand " + brand );
        System.out.println( "Car model " + Model );
        System.out.println( "Car speed " + speed );
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.Model = 'A';
        c1.speed = 100;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.Model = 'B';
        c2.speed = 125;

        Car c3 = new Car();
        c3.brand = "CREATA";
        c3.Model = 'C';
        c3.speed = 150;

        System.out.println("-------------------------------");
        c1.display();
        System.out.println("-------------------------------");
        c2.display();
        System.out.println("-------------------------------");
        c3.display();
        System.out.println("-------------------------------");
    }
}