public class OrderOfOperation {
    public static void main(String[] args) {
        System.out.println(9/3*3);      // B,O,D,M,A,S {'Bracket()' 'Order[root,square]' 'Divide/' 'Multiply*' 'Add+' 'Subtract-'}
        System.out.println(9/3/3);    // Here Same Operator Then Solve Left to Right

        System.out.println(9/(3/3));  // first priority Bracket()
        System.out.println(9/(5-2));



        System.out.println(9/3*6/6);
        System.out.println(9/3*2/6);

        System.out.println(4+2+"pqr");  // output = 6pqr   left to right (Associativity)
        System.out.println("pqr"+4+2);  // output = pqr42   left to right (Associativity)

        int p=4,q=3,r=2;
        int Sum=p-++r-++q;      // +,- Associativity (left to right)
        System.out.println("Sum is: "+Sum);

        Boolean a=false;
        Boolean b=false;
        Boolean c=true;
        System.out.println(a==b==c);    // ture
    }
}
