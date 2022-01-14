package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero! idiot:)");
        }
        catch (InputMismatchException e){
            System.out.println("PLEASE USE NUMBERS! WOW!");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }
    }
}
/* exception = an event that occurs during the execution of a program that disrupts the normal flow of instructions

think of it as*
unexpected events that occurs that will stop your program
like= if you divide by zero

 */