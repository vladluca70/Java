import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Enter a whole number x=");
            int x=scanner.nextInt();
            System.out.println("Enter a whole number y=");
            int y= scanner.nextInt();

            int result;
            result=x/y;
            System.out.println("The result is " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cannot use 0 for y");
        }
        catch(InputMismatchException e)
        {
            System.out.println("You have to enter a whole number");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        finally
        {
            scanner.close();
        }
    }
}