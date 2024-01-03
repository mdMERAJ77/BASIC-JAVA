public class DynamicVariable {
    public static void main(String[] args) {
        System.out.println("Program to show dynamic variable...");
        double a=3.0,b=4.0;

        // c is Dynamically initialized
        double c=Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse is "+c);
    }
}
