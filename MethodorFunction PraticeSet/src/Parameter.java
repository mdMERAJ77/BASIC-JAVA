public class Parameter {
    public static void main(String[] args)
    {
        System.out.println("Add to number...");
//        int Sum=SumToNumber(4,6);
//        System.out.println("Sum of two number is: "+Sum); //OUTPUT 10
        System.out.println(SumToNumber(4,6));
        System.out.println(SumToNumber(6,2));
        System.out.println(SumToNumber(-6,6));
    }
    public static int SumToNumber(int first, int second){
        System.out.println("First Number received: "+first);
        System.out.println("Second Number received: "+second);
        return first+second;
    }
}
