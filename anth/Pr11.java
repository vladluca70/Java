import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pr11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Hello!");

        String name= JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name+"!\n"+"Your dream cars?");

        String nString = JOptionPane.showInputDialog("Number of favourite cars: ");
        int n=Integer.parseInt(nString);

        String []cars= new String[100];

        for(int index=0; index<=n-1; index++)
        {
            String car_prefered = JOptionPane.showInputDialog("Car: ");
            cars[index]=car_prefered;
        }

        for(int index=0; index<n; index++)
            System.out.println(cars[index]);
        scanner.close();
    }
}