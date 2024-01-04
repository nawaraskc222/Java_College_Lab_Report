package Lab1;


//question 6
import java.util.Scanner;

public class AllEventHandle {

    public static void main(String[] args) {

        try {
            System.out.println("Enter a number: ");
            String userInput = new Scanner(System.in).nextLine();
            int number = Integer.parseInt(userInput);
            System.out.println("Done");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        try {
            int[] array = new int[3];
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            int n1 = 4 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}

