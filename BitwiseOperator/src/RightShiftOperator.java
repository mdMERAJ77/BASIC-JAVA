public class RightShiftOperator {
    public static void main(String[] args) {
        int p=9;        // 9 Binary Number= 1 0 0 1
        System.out.println(p>>1);
        System.out.println(p>>2);
        System.out.println(p>>3);
        System.out.println(p>>4);

        // thus it can be concluded from the above example that
        // Formula a>>b = a/(2Power b)
        System.out.println(10>>1);      // 10 Binary Number=1 0 1 0
        System.out.println(10>>2);
        System.out.println(10>>3);
        System.out.println(10>>4);
    }
}
