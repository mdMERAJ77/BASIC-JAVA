class pratice{
    void add()
    {
        int[] array={1,5,3};
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
public class Problem2 {
    public static void main(String[] args) {

        pratice obj=new pratice();
            obj.add();
//        int[] array={1,5,3};
//        int sum=0;
//        for(int i=0;i<array.length;i++)
//        {
//           sum+=array[i];
//        }
//        System.out.println("Total sum of array is:- "+sum);
    }
}
