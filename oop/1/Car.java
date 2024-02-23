public class Car {
    String make= "Ford";
    String model= "Mustang";
    int year =2020;
    double price= 50000.0;

    void start()
    {
        System.out.println("You drive the car");
    }

    void stop()
    {
        System.out.println("You do not drive the car");
    }

    int age()
    {
        return (2024-year);
    }
}