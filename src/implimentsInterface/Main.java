package implimentsInterface;

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
        System.out.println();
        Hawk hawk = new Hawk();
        hawk.hunt();
        System.out.println();
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

    }
}


/* Interface = a template that can be applied to class
             =similar to inheritance, but specifies what a class has/ must do.
             = classes can apply more than one interface, inheritance is limited to 1 super class

 */
