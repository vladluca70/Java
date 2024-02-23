public class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year)
    {
        //this.make=make;
        //this.model=model;
        //this.year=year;

        //it's the same

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    String getMake()
    {
        return make;
    }

    String getModel()
    {
        return model;
    }

    int getYear()
    {
        return year;
    }

    void setMake(String make)
    {
        this.make=make;
    }

    void setModel(String model)
    {
        this.model=model;
    }

    void setYear(int year)
    {
        this.year=year;
    }
}