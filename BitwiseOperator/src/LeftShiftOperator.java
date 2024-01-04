public class LeftShiftOperator {
    public static void main(String[] args) {
        int p=9;    // 9 = 1 0 0 1
        System.out.println(p<<1); // Output = 18
        System.out.println(p<<2); // Output = 36
        System.out.println(p<<3); // Output = 54

        // thus it can be concluded from the above example that-
        // formula:- a<<b = a*2(Power b)
        System.out.println(9<<4);   // a=9, b=4  a<<b=9*2(power 4)
        System.out.println(9<<5);
    }
}
