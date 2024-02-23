import java.util.Random;

public class RandomNumber {


    Random random = new Random();
    int number;

    RandomNumber()
    {
        number=random.nextInt(100);
    }

    void afisare ()
    {
        System.out.println(number);
    }
}

/*import java.util.Random;

public class RandomNumber {

    RandomNumber()
    {
        Random random= new Random();
        roll(random);
    }

    void roll(Random random)
    {
        int number= random.nextInt(100)+1;
        afisare(number);
    }

    void afisare(int number)
    {
        System.out.println("Numarul generat random este: "+number);
    }
}
*/