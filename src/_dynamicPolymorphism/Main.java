package _dynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want? ");
        System.out.print("(1= dog) or (2= cat): ");
        int choice = keyboardInput.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That animal was invalid");
            animal.speak();
        }
    }
}
/* Polymorphism = many shapes/ forms
        Dynamic = after complication (during runtime)
        Example = A corvette is a: corvette, and a car, and an object

Is the ability of an object to take many shapes/forms after the program is already running

You can declare an object and can make space for it in memory even if you don't know what type of object you want yet
 */