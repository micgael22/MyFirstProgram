package hypnotenuseOfTriangle;
import java.util.Scanner;
public class HypotenuseOfTriangle {

    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter side: ");
        x = keyboardInput.nextDouble();

        System.out.println("Enter side y: ");
        y = keyboardInput.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: " + z);
    }
}
