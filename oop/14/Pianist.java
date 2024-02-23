public class Pianist extends Singer {

    Pianist(String name, int age, int yearsExperience)
    {
        super(name, age, yearsExperience);
    }
    
    void sing()
    {
        System.out.println("The pianist is singing");
    }

    void play()
    {
        System.out.println("The pianist is playing");
    }
}