// TakingInput.java
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of array elements
        System.out.println("Enter the size of array elements: ");

        // Read the size of the array from the user
        int n = sc.nextInt();

        // Create an array of integers with the specified size
        int[] array = new int[n];

        // Prompt the user to enter the array elements
        System.out.println("Enter " + n + " elements:");

        // Read the array elements from the user
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Display the entered array elements
        System.out.println("Entered elements:");

        // Print the array elements
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the Scanner to avoid resource leaks
        sc.close();
    }
}
