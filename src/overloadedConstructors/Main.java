package overloadedConstructors;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("thick crust");

        System.out.println("Here are the ingredients of your pizza: ");

        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

    }
}
// Overloaded constructors = Multiple constructors within a class with the same name,
//                         = but have different parameters
//                         = name + parameters = signature