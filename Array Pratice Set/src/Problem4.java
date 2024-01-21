// Define a class named ArrayClass1
class ArrayClass1 {

    // Method to search for occurrences of a specific element in the array
    void search() {
        // Initialize an array
        int[] array = {1, 3, 5, 6, 5, 3};

        // Specify the element to search for
        int x = 3;

        // Flag to check if at least one occurrence is found
        boolean found = false;

        // Iterate through the array to search for the specified element
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is equal to the specified element
            if (x == array[i]) {
                // Print the index of the element if found
                System.out.println("Index of " + x + ": " + i);
                // Set the flag to true since at least one occurrence is found
                found = true;
            }
        }

        // If the element is not found, print "Not found"
        if (!found) {
            System.out.println("Not found");
        }
    }
}

// Main class named Problem4
public class Problem4 {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the ArrayClass1
        ArrayClass1 obj = new ArrayClass1();

        // Call the search method to find occurrences of a specific element in the array
        obj.search();
    }
}
