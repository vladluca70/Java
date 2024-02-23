public class Pr1 {

    public static void main(String[] args) {
        
        Car masina1= new Car();
        Car masina2= new Car();

        int year1=masina1.year;
        System.out.println(year1);

        String model2=masina2.model;
        System.out.println(model2);

        masina1.start();
        masina2.stop();

        System.out.println(masina1.age());
    }

}
