import java.util.Scanner;

public class Pr8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day;
        day=scanner.nextLine();

        switch(day)
        {
            case "Monday": System.out.println("It's Monday");
            break;

            case "Tuesday": System.out.println("It's Tuesday");
            break;

            case "Wednesday": System.out.println("It's Wednesday");
            break;

            case "Thursday": System.out.println("It's Thursday");
            break;

            case "Friday": System.out.println("It's Friday");
            break;

            case "Saturday": System.out.println("It's Saturday");
            break;

            case "Sunday": System.out.println("It's Sunday");
            break;

            default: System.out.println("That is not a day");
        }

        
        ////
        int x;
        x=scanner.nextInt();

        switch(x%2)
        {
            case 0: System.out.println("It's even");
            break;

            case 1: System.out.println("It's odd");
            break;
        }

        scanner.close();
    }
}