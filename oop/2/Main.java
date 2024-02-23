public class Main {

    public static void main(String[] args) {
        
        Human man1= new Human("Vlad", 21, 85);
        Human woman1= new Human("Daria", 20, 70);

        System.out.println(man1.name+" are "+man1.age+" de ani si "+man1.weight+" kilograme");
        man1.eat();

        System.out.println(woman1.name+" are "+woman1.age+" ani si "+woman1.weight+" kilograme");
        woman1.eat();

        if(man1.age> woman1.age)
            System.out.println(man1.name+" is older than "+woman1.name);
        else
            System.out.println(woman1.name+" is older tham "+ man1.name);
    }
}