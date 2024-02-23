public class Square extends Shape{

    int edge1;
    int edge2;

    Square(int edge1, int edge2)
    {
        this.edge1=edge1;
        this.edge2=edge2;
    }

    @Override
    void computeArea()
    {
        area=edge1*edge2;
    }

}