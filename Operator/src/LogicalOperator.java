public class LogicalOperator {
    public static void main(String[] args) {
        int p=15, q=10, r=5;

        // && Operator
        System.out.println((p>q) && (p>r));   //true
        System.out.println((p>q) && (p<r));   //false

        //  || Operator
        System.out.println((p>q) || (p<r));   //true
        System.out.println((p<q) || (p<r));   //false
        System.out.println((p<q) || p>r);     //true

        //  ! Operator
        System.out.println(!(p>q)); //false
        System.out.println((!(p<q))); // true
    }
}
