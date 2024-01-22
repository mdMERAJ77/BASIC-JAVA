import java.util.Arrays;

public class ArrayReference {
    // Method to print the elements of an array
    static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // Creating and initializing the original array
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;
        array[4] = 9;

        // Printing the original array
        System.out.println("Original array");
        PrintArray(array);

        // Creating a reference to the original array
        int[] array_2 = array;

        // Printing the copied array (which points to the same array as the original)
        System.out.println("Copied array ");
        PrintArray(array_2);

        // Changing some values of the original array
        array[0] = 0;
        array[1] = 0;

        // Printing the original array after changing some values
        System.out.println("Changing original array after changing array_2");
        PrintArray(array);

        // Printing the copied array (which reflects the changes made to the original array)
        System.out.println("Copied array (array_2) after changing original array");
        System.out.println(Arrays.toString(array_2));
    }
}
