public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.print("Before the Swapping: ");
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After the Swapping:  ");
        System.out.println(a+" "+b);
    }
}
