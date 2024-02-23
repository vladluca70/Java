public class Friend {

    String name;
    static int numberFriends;

    Friend(String name)
    {
        numberFriends++;
        this.name=name;
    }

    static void displayFriends()
    {
        System.out.println("You have "+numberFriends+" friends");
    }
}