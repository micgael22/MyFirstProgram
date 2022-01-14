package differentLoops;
import java.util.Scanner;
public class NestedLoops {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = keyboardInput.nextInt();
        System.out.println("Enter number of columns: ");
        columns = keyboardInput.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = keyboardInput.next();

        for (int i = 1; i <= rows; i++){
            System.out.println();
            for (int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
// nested loop is = a loop inside a loop