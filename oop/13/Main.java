public class Main {

    public static void main(String[] args) {
        
        Square square = new Square(10, 2);
        square.displayArea();

        Rectangle rectangle= new Rectangle(10, 5);
        rectangle.displayArea();

        Circle circle1= new Circle(4);
        circle1.displayArea();

        Circle circle2= new Circle(10);
        circle2.displayArea();
    }
}