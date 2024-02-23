public class Drummer extends Singer{

    Drummer(String name, int age, int yearsExperience)
    {
        super(name, age, yearsExperience);
    }

    void play()
    {
        System.out.println("The drummer is playing");
    }

    void sing()
    {
        System.out.println("The drummer is singing");
    }
}