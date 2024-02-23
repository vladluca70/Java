public class Vehicle {

    double speed;
    static int numberVehicles;

    Vehicle()
    {
        numberVehicles++;
    }

    void go()
    {
        System.out.println("The vehicle is moving");
    }

    void stop()
    {
        System.out.println("The vehicle is stopped");
    }
}


