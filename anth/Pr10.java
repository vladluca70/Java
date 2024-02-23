
public class Pr10 {

    public static void main(String[] args) {
            String []cars={
                "Dacia",
                "Ferrari",
                "Lambo",
                "Ford"
            };

            for(int index=0; index<=cars.length-1; index++)
                System.out.println(cars[index]);

            
            System.out.println();

            int []note={
                10,
                8,
                9,
                5
            };
            for(int index=0; index<=note.length-1; index++)
                System.out.println(note[index]);

            System.out.println();

            String []materii= new String[3];
            materii[0]= "BD";
            materii[1]= "OOP";
            materii[2]= "ACSO";
            for(int index=0; index<=materii.length-1; index++)
                System.out.println(materii[index]);
    }
}