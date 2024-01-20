// Define a class named Pratice (Note: class names should start with an uppercase letter)
class Pratice {

    // Method to demonstrate the use of a String array
    void Array() {
        // Initialize a String array with names
        String[] names = {"MERAJ", "SAKIB", "SARIK", "SHADIK"};

        // Loop through the array and print each name
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

// Main class
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Create an instance of the Pratice class
        Pratice obj = new Pratice();

        // Call the Array method to demonstrate the use of a String array
        obj.Array();
    }
}
