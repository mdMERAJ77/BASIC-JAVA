public class UnaryOperator {
    public static void main(String[] args) {
        int x=5;
        int y=-x;   // Convert a Positive value to a Negative like
        System.out.println(y);

        int z=-y;
        System.out.println(z);

        int a=++x;  // Pre Increment Here increment the value of 1
        System.out.println(a);

        int b=--z;  // Pre Decrement Here decrement the value of 1.  here value of z is 5
        System.out.println(b);

        int p=10;
        System.out.println(p++); //Post Increment. Here Use Current value in the statement and then increment it by 1
        System.out.println(p);

        System.out.println(p--); // Post Decrement. Here Use Current value in the statement and then Decrement it by 1
        System.out.println(p);
    }
}
