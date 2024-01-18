public class equalsIgnoreCase {
    public static void main(String[] args) {
        String name="MERAJ";

        System.out.println(name.equalsIgnoreCase("meraj")); //OUTPUT true
        System.out.println(name.equalsIgnoreCase("MERAJ")); //OUTPUT true
        System.out.println(name.equalsIgnoreCase("ME"));    //OUTPUT false
    }
}
