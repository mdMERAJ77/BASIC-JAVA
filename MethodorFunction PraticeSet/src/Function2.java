public class Function2 {
    public static void main(String[] args) {
        // First target for the JVM: Printing "Triangle Pattern"
        System.out.println("Triangle Pattern");
        // Second target for the JVM: Calling the TrianglePattern
        TrianglePattern();

        // Third target for the JVM: Printing "Inverse Triangle Pattern"
        System.out.println("Inverse Triangle Pattern");

        // Fourth target for the JVM: Calling the InverseTrianglePattern
        InverseTrianglePattern();

        // Fifth target for the JVM: Printing "Left Shift Triangle Pattern"
        System.out.println("Left Shift Triangle Pattern");
        // Sixth target for the JVM: Calling the LeftShiftTrianglePattern
        LeftShiftTrianglePattern();
    }

    // Function to print a triangle pattern
    public static void TrianglePattern() {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // Function to print an inverse triangle pattern
    public static void InverseTrianglePattern() {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 5; j > i + 1; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // Function to print a left shift triangle pattern
    public static void LeftShiftTrianglePattern() {
        // Define the number of rows in the triangle
        int row = 5;

        // Outer loop to iterate through each row
        for (int i = 0; i < row; i++) {
            // Inner loop to print spaces before the asterisks
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Inner loop to print asterisks in an increasing pattern
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after completing each row
            System.out.println(" ");
        }
    }
}
