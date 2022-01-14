package differentLoops;
import java.util.Scanner;
public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        String name = "";

        do {
            System.out.println("Enter your name: ");
            name = keyboardInput.nextLine();
        }
        while (name.isBlank());
            System.out.println("Hello " + name);
    }
}
// similar to while loop. Do while loop will print whatever than check the condition