import java.util.Scanner;

public class Pr14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.print("Your number is: ");
        x=scanner.nextInt();

        if(estePrim(x)==1)
            afis_true();
        else
            afis_false();

        scanner.close();
    }

public static int estePrim(int x)
{
    int div=0;
    for(int i=1;i<=x; i++)
        if(x%i==0)
            div++;
    
    if(div==2)
        return 1;
    return 0;
}

public static void afis_true()
{
    System.out.println("Este prim");
}

public static void afis_false()
{
    System.out.println("Nu este prim");
}

}