import java.util.Scanner;
import java.util.Random;

public class MathClass {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int a=1, b=3, c=2, max;
        //a=scanner.nextInt();
        //b=scanner.nextInt();
        //c=scanner.nextInt();
        max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println(max);



        double d=10, f=3.14;
        double min = Math.min(d,f);
        double radical = Math.sqrt(d);
        double rotunjit = Math.round(f);
        double rotunjit_sup = Math.ceil(f);
        double rotunjit_inf = Math.floor(f);
        System.out.println(min+" "+radical+" "+rotunjit+" "+rotunjit_sup+" "+rotunjit_inf);


        int r = random.nextInt(11);  //return a random integer between 0 and 10
        System.out.println(r);


        scanner.close();
    }
}