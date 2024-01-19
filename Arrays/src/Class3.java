public class Class3 {
    public static void main(String[] args) {
        // Declare a 2D array named 'flats'
        int [][] flats;   // 2D array
        // Allocate memory for the 2D array with 2 rows and 3 columns
        flats = new int[2][3];

        // Initialize values in the 2D array
        flats[0][0] = 1;
        flats[0][1] = 2;
        flats[0][2] = 3;

        flats[1][0] = 4;
        flats[1][1] = 5;
        flats[1][2] = 6;

        // Print the 2-D array using nested for loop
        System.out.println("Printing a 2-D array using for loop:- ");
        for(int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                // Print the element at the current position in the array
                System.out.print(flats[i][j]);
                // Print a space to separate elements
                System.out.print(" ");
            }
            // Move to the next line after printing each row
            System.out.println(" ");
        }
    }
}
