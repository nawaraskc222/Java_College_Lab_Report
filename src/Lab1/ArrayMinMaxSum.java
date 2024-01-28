package Lab1;

/////question 3
import java.util.Scanner;

public class ArrayMinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();       
        int[] arr = new int[size];       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }     
        int smallest = arr[0];
        int largest = arr[0];
        int sum = 0;
        for (int i = 0; i < size; i++) {          
            if (arr[i] < smallest) {
                smallest = arr[i];
            }          
            if (arr[i] > largest) {
                largest = arr[i];
            }          
            sum += arr[i];
        }       
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
        System.out.println("Sum of Elements: " + sum);

        scanner.close();
    }
}
