package operators;
import java.util.Scanner;
public class LogicalOperators {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = keyboardInput.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
    }
}
/* && = AND (both conditions must true)
           || = OR (either condition must be true)
           ! = NOT (reverses boolean of condition)

        int temp = 15;

        if (temp >30){
            System.out.println("It is not hot outside.");
        }
        else if (temp >= 20 && temp <= 30){
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = keyboardInput.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game *pew pew*");
        }*/