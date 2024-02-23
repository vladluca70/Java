import java.util.Scanner;

public class program5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x=133333232342341242L; //pentru variabile de tip long, at the very end of the number we use the letter L
        System.out.println("My number is: "+ x);
        
        float y;
        y=3.14f; //for float variables, we use at the end of the number the letter f
        System.out.println("My number is: "+ y);

        double z=3.14; //!! there we do not use letter at the end of the number
        System.out.println("My number is: "+ z);

        boolean t=true;
        System.out.println("The value is: "+ t);

        char symbol;
        symbol= '#';
        System.out.println(symbol);

        String first_name;
        first_name="Vlad";
        System.out.println(first_name);

        String last_name="Luca";
        char space=' ';
        String name;
        name=last_name+space+first_name;
        System.out.println(name);

        scanner.close();
    }
}


/*
 * sysout+Enter => System.out.println();
 * 
 * pentru replace:
 * select the word
 * ctrl+H
 * 
 * 
 */