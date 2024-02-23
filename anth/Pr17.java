import java.util.ArrayList;
import java.util.Scanner;

public class Pr17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> food= new ArrayList<>();
        food.add("sushi");
        food.add("kebab");
        food.add("pizza");

        ArrayList<String> drink= new ArrayList<>();
        drink.add("soda");
        drink.add("cola");

        ArrayList<ArrayList<String>> myList= new ArrayList<>();
        myList.add(food);
        myList.add(drink);


        for(int index=0; index<myList.size(); index++)
            System.out.println(myList.get(index));

        
        for(int index=0; index<myList.size(); index++)
            for(int j=0; j<myList.get(index).size(); j++)
                System.out.println(myList.get(index).get(j));
        scanner.close();
    }
}