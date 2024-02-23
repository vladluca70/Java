// public class Hawk extends Predator{

    
// }

// acest cod nu va rula
//cu extends putem mosteni doar o clasa
//avem nevoie de "interface"

public class Hawk implements Predator{

    @Override
    public void hunt()
    {
        System.out.println("The hawk is hunting");
    }

}
