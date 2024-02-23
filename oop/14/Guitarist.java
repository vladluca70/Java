public class Guitarist extends Singer{

    Guitarist(String name, int age, int yearsExperience)
    {
        super(name, age, yearsExperience);
    }

    void play()
    {
        System.out.println("The guitarist is playing");
    }

    void  sing()
    {
        System.out.println("The guitarist is singing");
    }
}