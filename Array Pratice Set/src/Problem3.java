import java.util.Scanner;

// Define a class named ArrayClass
class ArrayClass {

    // Method to calculate the maximum value in the array
    void MaxOfArray() {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize an array with the specified number of elements
        int[] array = new int[n];

        // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Initialize a variable to store the maximum value
        int max = array[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                // Update the max variable if a larger value is found
                max = array[i];
            }
        }

        // Print the maximum value in the array
        System.out.println("Maximum value in the array: " + max);
    }
}

// Main class named Problem3
public class Problem3 {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the ArrayClass
        ArrayClass obj = new ArrayClass();

        // Call the MaxOfArray method to calculate the maximum value in the array
        obj.MaxOfArray();
    }
}
