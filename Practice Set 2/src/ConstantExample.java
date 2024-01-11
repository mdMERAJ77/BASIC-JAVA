public class ConstantExample {
    public static final int NumberOfMonths = 12;
    public static final double Pi = (double) 22 / 7;

    public static void main(String[] args) {

        // Redefining a local variable named NumberOfMonths within the main method
        int NumberOfMonths = 10;
        // Printing the value of the local variable NumberOfMonths
        System.out.println("Number Of Months (local variable): " + NumberOfMonths);

        // Redefining a local variable named Pi within the main method
        float Pi=(float) 3.1;
        // Printing the value of the local variable Pi
        System.out.println("Value of Pi (local variable): " + Pi);


        // Accessing the class-level constant NumberOfMonths outside of the main method scope
        System.out.println("Number Of Months (constant): " + ConstantExample.NumberOfMonths);
        //Accessing the class-level constant Pi outside of the main method scope
        System.out.println("Value of Pi (constant): "+ConstantExample.Pi);
    }
}