package scanner;
import java.util.Scanner;
public class TheScanner {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = keyboardInput.nextLine();

        System.out.println("What is your age?");
        int age = keyboardInput.nextInt();
        keyboardInput.nextLine();

        System.out.println("What is your favourite food?");
        String food = keyboardInput.nextLine();

        System.out.println("Hello  " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("You like " + food);
    }
}
