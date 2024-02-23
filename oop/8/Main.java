public class Main {

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        Book book1 = new Book("The lovely bones", "Alice Sebold");
        Book book2 = new Book("Plumb", "George Bacovia");

        bookstore.afis(book1);
        bookstore.afis(book2);
    }
}