package differentLoops;
import java.util.Scanner;
public class WhileLoop {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.println("Enter your name: ");
            name = keyboardInput.nextLine();

            System.out.println("Hello " + name);
        }
    }
}
// while loop = execute a block of code as long as it's condition remains true