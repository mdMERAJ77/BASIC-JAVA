public class BitwiseComplementOperator {    // also known as BitwiseNOTOperator
    public static void main(String[] args) {
        int p=9, q=10, r=-9, s=-10;

        System.out.println(~p); // output = -10

        System.out.println(~q);  // output = -11

        System.out.println(~r);  // output = 8

        System.out.println(~s);  // output = 9

        // Thus it can be concluded from the above example that-

        // 1:- For any integer n, the bitwise complement of n will be -(n+1).
        // 2:- Bitwise complement of N = ~N (represented in 2’s complement form).
        // 3:- 2’complement of ~N= -(~(~N)+1) = -(N+1).


    }
}
