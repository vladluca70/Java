public class Main {

    public static void main(String[] args) {
       
        Car car = new Car("Ford", "Mustang", 2024);

        // System.out.println(car.make); nu va functiona deoarece make este de tip private

        System.out.println(car.getMake()+" "+car.getModel()+" "+car.getYear());

        car.setMake("BMW");
        car.setModel("i8");
        System.out.println(car.getMake()+" "+car.getModel()+" "+car.getYear());

   }
}

/*
 * Encapsulation= attributes of a class will be hidden or private
 *                can be accessed only through methods (getters & setters)
 */