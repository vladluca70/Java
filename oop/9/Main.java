public class Main {

    public static void main(String[] args) {
        Friend friend1 = new Friend("Harry");
        Friend friend2 = new Friend("Jack");
        Friend friend3 = new Friend("Kevin");

        System.out.println(Friend.numberFriends);
        Friend.displayFriends();
    }
}

//static keyword