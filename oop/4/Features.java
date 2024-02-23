public class Features {

    String firstName, lastName;
    int age;
    double averageGrades;

    Features(String firstName, String lastName, int age, double averageGrades)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.averageGrades=averageGrades;
        afisare();
    }

    void afisare()
    {
        System.out.println(firstName+" "+lastName);
    }
}