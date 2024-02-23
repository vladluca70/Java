abstract public class Singer {

    String name;
    int age;
    int yearsExperience;

    Singer(String name, int age, int yearsExperience)
    {
        this.name=name;
        this.age=age;
        this.yearsExperience=yearsExperience;
    }

    int getAge()
    {
        return age;
    }

    String getName()
    {
        return name;
    }

    int getYearsExperience()
    {
        return yearsExperience;
    }


    abstract void play();
    abstract void sing();
}