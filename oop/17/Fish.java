public class Fish implements Predator, Prey{

    @Override
    public void hunt()
    {
        System.out.println("The fish is hunting");
    }

    @Override
    public void flee()
    {
        System.out.println("The fish is fleeing");
    }
}