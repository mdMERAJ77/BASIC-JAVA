public class Continue {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=7;i++)
        {
            if(i == 4)
            {
                continue;
            }
            System.out.println(i);      // Output 1 2 3 Here 4 not print and jump 5 6 7
        }
    }
}
