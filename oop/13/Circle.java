public class Circle extends Shape{

    int radius;
    final float pi=3.14F;

    Circle(int radius)
    {
        this.radius=radius;
    }

    @Override
    void computeArea()
    {
        area=pi*radius*radius;
    }
}