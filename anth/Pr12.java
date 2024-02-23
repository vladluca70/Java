import java.util.Scanner;

public class Pr12 {

    public static void main(String[] args) {
        ////////////////
        String [][]cars = new String[2][2];
        cars[0][0]= "Toyota";
        cars[0][1]= "Dacia";
        cars[1][0]= "Tesla";
        cars[1][1]= "Mustang";

        for (int i=0; i<=cars.length-1; i++)
        {
            System.out.println();

            for(int j=0; j<=cars[i].length-1; j++)
                System.out.print(cars[i][j]+" ");
        }
        System.out.println();

        ////////////////////////////
        String [][]materii  =   { 
                                    {"BD", "OOP"}, 
                                    {"Java", "SD"} 
                                };

        for(int i=0; i<=materii.length-1; i++)
        {
            System.out.println();
            for(int j=0; j<=materii[i].length-1; j++)
                System.out.print(materii[i][j]+" ");
        }
        System.out.println();

        
        //////////////
        Scanner scanner = new Scanner(System.in);
        String [][]day = new String[100][100];
        int n=3, m=2;
        for(int i=0; i<n; i++)
        {   
            String zi;
            for(int j=0; j<m; j++)
            {    
                zi=scanner.nextLine();
                day[i][j]=zi;
            }
        }

        for(int i=0; i<3; i++)
        {
            System.out.println();
            for(int j=0; j<2; j++)
                System.out.print(day[i][j]+" ");
        }
        scanner.close();
    }
}   