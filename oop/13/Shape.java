abstract public class Shape {

    float area;

    void displayArea()
    {
        computeArea();
        System.out.println(area);
    }

    abstract void computeArea();
}