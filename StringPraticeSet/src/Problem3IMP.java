public class Problem3IMP {
    public static void main(String[] args)
    {
        String MyString= "This string contains  double and triple   spaces";
        System.out.println(MyString.indexOf("  "));     //OUTPUT 20
        System.out.println(MyString.indexOf("   "));    //OUTPUT 39
        System.out.println(MyString.indexOf("        ")); //OUTPUT -1
    }
}
