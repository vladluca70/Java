import java.util.Scanner;

public class Pr9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String she=scanner.nextLine();

        if(she.equals("start") || she.equals("Start"))  //do not use 'she=="quit" '
            System.out.println("Start");
        else
            System.out.println("Another option");


        String name="";
        while(name.isBlank())
        {
            System.out.println("What is your name? ");
            name=scanner.nextLine();
        }
        System.out.println("Hello "+name);
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

