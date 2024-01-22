public class Function {
    public static void main(String[] args) {
        // First target for the JVM, printing a message
        System.out.println("JVM first target");

        // Calling the greeting function, which is the second target for the JVM
        greeting();

        // Third target for the JVM, printing another message
        System.out.println("JVM third target");

        //Calling the greeting function again, which is the fourth target for the JVM
        greeting();
    }
    // Function to print a greeting message
    public static void greeting() {
        System.out.println("Good Morning meraj!");
    }
}
