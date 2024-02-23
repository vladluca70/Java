public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight)
    {
        this.age=age;
        this.name=name;
        this.weight=weight;
    }

    void eat()
    {
        System.out.println(this.name+" is eating");
    }
}