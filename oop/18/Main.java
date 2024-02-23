public class Main {

    public static void main(String[] args) {
        
        Car car= new Car();
        Bike bike= new Bike();
        Boat boat = new Boat();

        //car.go();;
        //bike.go();
        //boat.go();

        Vehicle []racers= {car, bike, boat};

        for(Vehicle i: racers)
        {
            i.go();
        }
    }
}

//polymorphism= the ability of an object to identify as more than one type
