public class Break {
    public static void main(String[] args) {

        int i;
        for(i=1; i<=10; i++)
        {
            if(i == 5)
            {
                break;
            }
            System.out.println(i); // Output 1 2 3 4 and terminate program
        }
    }
}
