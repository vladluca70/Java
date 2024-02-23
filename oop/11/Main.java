public class Main {

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.speak();
        System.out.println("The animal has "+animal.paws+" paws");

        Dog dog= new Dog();
        dog.speak();

        Cat cat = new Cat();
        cat.speak();
    }
}

//overriding