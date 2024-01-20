// Define a class named ArrayExample
class ArrayExample {

    // Method to demonstrate multi-dimensional arrays
    void MultiArrays() {
        // Initialize a 2D array with values
        int[][] array = {{2, 4, 2}, {5, 5, 1}, {9, 0, 7}};

        // Print elements of the 2D array
        System.out.println("Elements of the 2D array:");
        System.out.println(array[0][0]);    //2
        System.out.println(array[0][1]);    //4
        System.out.println(array[0][2]);    //2

        System.out.println(" ");

        System.out.println(array[1][0]);    //5
        System.out.println(array[1][1]);    //5
        System.out.println(array[1][2]);    //1

        System.out.println(" ");

        System.out.println(array[2][0]);    //9
        System.out.println(array[2][1]);    //0
        System.out.println(array[2][2]);    //7

        // Print the length of the 2D array
        System.out.println("Length of Array is: " + array.length);
    }
}

// Main class
public class MultiDimensional {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the ArrayExample class
        ArrayExample obj = new ArrayExample();

        // Call the MultiArrays method to demonstrate multi-dimensional arrays
        obj.MultiArrays();
    }
}
