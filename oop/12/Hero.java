public class Hero extends Person{

    String power;

    Hero(String name, int age, String power)
    {
        //this.name=name;
        //this.age=age;
        super(name, age);
        this.power = power;
    }
}