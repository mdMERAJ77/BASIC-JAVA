public class LogicalOperator {
    public static void main(String[] args) {
        int p=15, q=10, r=5;

        // && Operator
        // AND(&&) Operator Both Statement when Correct then Output true(1) Otherwise false(0)
        System.out.println((p>q) && (p>r));   //true
        System.out.println((p>q) && (p<r));   //false

        //  || Operator
        //  OR(||) Operator At least One Statement Correct then Output true(1) Otherwise false(0)
        System.out.println((p>q) || (p<r));   //true
        System.out.println((p<q) || (p<r));   //false
        System.out.println((p<q) || p>r);     //true

        //  ! Operator
        //  NOT(!) Operator Like a Converter. When Statement true(1) Then Output false(0) Similar false(0) Output true(1)
        System.out.println(!(p>q)); //false
        System.out.println((!(p<q))); // true
    }
}
