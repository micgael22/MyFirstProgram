package overrideMethods;
public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Dog dog = new Dog();
        dog.speak();
    }
}
/* method overriding = Declaring a method in sub the class,
                     = which is already representing in the parent class.
                     = done so that the child class can give its own implementation
*/