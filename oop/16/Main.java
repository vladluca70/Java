public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X6", 2024);
        Car car2 = new Car("Audi", "Q8", 2020);

        System.out.println(car1.getModel());

        car1.setModel("i8");
        System.out.println(car1.getMake()+" "+car1.getModel()+" "+car1.getYear());

        car1.copy(car2);
        System.out.println(car1.getMake()+" "+car1.getModel()+" "+car1.getYear());
        System.out.println(car2.getMake()+" "+car2.getModel()+" "+car2.getYear());

    }
}


//copy objects
// it needs a method called copy