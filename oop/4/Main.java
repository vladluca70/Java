public class Main {

    public static void main(String[] args) {
        
        Features student1= new Features("Vlad", "Luca", 21, 7.52);
        Features student2= new Features("Ilie", "Anton", 20, 8);

        student1.afisare();
        if(student1.age>student2.age)
            System.out.println(student1.firstName+" is older than "+ student2.firstName);
        else
            System.out.println(student2.firstName+" is older than "+student1.firstName);
    }
}