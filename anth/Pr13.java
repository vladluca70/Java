public class Pr13 {

    public static void main(String[] args) {
        
        String name= "Vlad";
        boolean verify= name.equals("Vlad");
        //boolean verify = name.equalsIgnoreCase("vlad");

        if(verify==true)
            System.out.println("True");
        else
            System.out.println("False");

        int lungime;
        lungime=name.length();
        System.out.println(lungime);

        char position_of_character;
        position_of_character=name.charAt(0);
        System.out.println(position_of_character);

        int result;
        result=name.indexOf("a");
        System.out.println(result);

        String upperName;
        upperName=name.toUpperCase();
        System.out.println(upperName);

        String lowerName;
        lowerName=name.toLowerCase();
        System.out.println(lowerName);
  }

}