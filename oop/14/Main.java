public class Main {

    public static void main(String[] args) {

        Pianist pianist = new Pianist("Andrei", 34, 20);
        System.out.println(pianist.getName());
        pianist.play();

        Guitarist guitarist = new Guitarist("Matei", 40, 33);
        System.out.println(guitarist.getName()+" has "+ guitarist.getAge()+" age.");
        guitarist.sing();

        Drummer drummer = new Drummer("Daria", 20, 1);
        System.out.println(drummer.name+ " has "+ drummer.yearsExperience+" years of experience");

    
    }
}