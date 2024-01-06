public class Continue {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=7;i++)
        {
            if(i == 4)
            {
                continue;
            }
            System.out.println(i);      // Output 1 2 3 5 6 7 Here 4 skip in program
        }
    }
}
