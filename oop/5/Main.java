public class Main {

    public static void main(String[] args) {
        
        //Pizza pizza= new Pizza("crust bread", "tomato", "mozzarella", "pepperoni");
        Pizza pizza= new Pizza("crust bread", "tabasco");

        if(pizza.bread != null)
            System.out.println(pizza.bread);
        
        if(pizza.sauce !=null)
            System.out.println(pizza.sauce);
        
        if(pizza.cheese != null)
            System.out.println(pizza.cheese);
        
        if(pizza.topping != null)
            System.out.println(pizza.topping);
    }
}

//overloaded constructors