import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,suma;
        String c;
        String d="Hello ";

        a=scanner.nextInt();
        b=scanner.nextInt();
        scanner.nextLine();
        c=scanner.nextLine();

        suma=a+b;
        d=d+c;

        System.out.println(suma);
        System.out.println(d);

        System.out.println("elemente: ");
        int i,s=0, x;
        for(i=1;i<=3;i++)
        {
            x=scanner.nextInt();
            s=s+x;
        }
        System.out.print(s);
        scanner.close();
    }
}