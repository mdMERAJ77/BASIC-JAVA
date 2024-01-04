public class IfElse {
    public static void main(String[] args) {
        boolean IsMale=false;
        String Name="Bob";

        System.out.println("After if");
        if(IsMale)    // Here Condition is false so, Skip this (if block code) and jump (else block)
        {
            System.out.println("Mr."+Name);
        }
        else
        {
            System.out.println("Ms."+Name);
        }
        System.out.println("Before if");
    }
}
/* Output:-  After if
             Ms.Bob
             Before if
*/