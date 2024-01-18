public class StringFormatting {
    public static void main(String[] args) {
        // Uncomment the following block to demonstrate formatting and printing variables
        int a = 6;
        float b = 5.235252f;

        // Basic formatting with placeholders
        System.out.printf("The value of a is %d and value of b is %f", a, b);

        // Formatting with precision for the floating-point number
        System.out.printf("\nThe value of a is %d and value of b is %.2f", a, b);

        // Formatting with width for the floating-point number
        System.out.printf("\nThe value of a is %d and value of b is %20f", a, b);
    }
}
