public class Pr16 { //overloading methods

    public static void main(String[] args) {
        int a=3, b=5, e=19;
        int suma= add(a,b);
        System.out.println(suma);

        double c=4.5, d=5.4;
        double s;
        s=add(c, d);
        System.out.println(s);
        
        int ff=add(a,b,e);
        System.out.println(ff);

        int z=3, t=3;
        final int w=5;      //!!!
        z=5;
        //w=4;              !! nu se poate din cauza lui 'final'
        System.out.println(add(z,t,w));
    }

    static int add(int a, int b)
    {
        return (a+b);
    }

    static double add(double a, double b)
    {
        return (a+b);
    }

    static int add(int a, int b, int c)
    {   
        return (a+b+c);
    }
}