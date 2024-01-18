public class indexOf {
    public static void main(String[] args) {
        String name="MERAMJEEM";
        System.out.println(name.indexOf("E"));  //OUTPUT 1

        System.out.println(name.indexOf("E",4));    //OUTPUT 6

        System.out.println(name.indexOf("B")); // OUTPUT -1  because B is not exits in String
    }
}
