public class Main {

    public static void main(String[] args) {
     
        Hawk hawk = new Hawk();
        hawk.hunt();
        
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

//interface= a template that can be applied to a class
//          similar to inheritance, but specifies what a class must do
//          classes can apply more than one interface, inheritance is limited to one super class !!!**!!!