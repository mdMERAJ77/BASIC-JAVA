public class Function2 {
    public static void main(String[] args) {
        //First target for the JVM: Printing "Triangle Pattern
        System.out.println("Triangle Pattern");
        // Second target for the JVM: Calling the TrianglePattern
        TrianglePattern();

        // Third target for the JVM: Printing "finished"
        System.out.println("Inverse Triangle Pattern");

        // Fourth target for the JVM: Calling the InverseTrianglePattern
        InverseTrianglePattern();
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
}
