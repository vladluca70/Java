import java.util.ArrayList;

public class Pr15 {

    public static void main(String[] args) {
        
        ArrayList<String> food= new ArrayList<>();

        food.add("pizza");
        food.add("pickle");
        food.add("hamburger");
        //food.clear();
        food.set(1, "sushi");
        food.remove(0);


        for(int index=0; index<food.size(); index++)
            System.out.println(food.get(index));
        System.out.println();

        /////////////////////

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("soda");
        drinks.add("cola");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("plum");

        ArrayList<String> vegetables= new ArrayList<>();
        vegetables.add("parsnip");
        vegetables.add("parsley");
        vegetables.add("cauliflower");

        ArrayList<ArrayList<String>> all= new ArrayList<>();
        all.add(drinks);
        all.add(fruits);
        all.add(vegetables);

        for(int index=0; index<all.size(); index ++)
            System.out.println(all.get(index));
        
        System.out.println();
        System.out.println(all.get(1).get(2)); //!!
        System.out.println();

        for(int index=0; index<all.size(); index ++)
        {
            for(int j=0; j<all.get(index).size(); j++)
                System.out.print(all.get(index).get(j)+" ");
        }
        System.out.println();

        for(String i: fruits)  ///////////////////////another way to print the values
            System.out.print(i+"_");
        System.out.println();

        int []note= new int[3];
        note[0]=10;
        note[1]=2;
        note[2]=5;

        for (int i: note)
            System.out.print(i+"__");
        System.out.println();
    }
}