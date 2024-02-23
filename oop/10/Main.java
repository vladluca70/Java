public class Main {

    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle();
        vehicle.go();

        Car car= new Car();
        car.go();
        System.out.println(car.doors);

        Bicycle bike= new Bicycle();
        bike.stop();
        System.out.println(bike.wheels);

        System.out.println("Number: "+ Vehicle.numberVehicles);
    }
}

