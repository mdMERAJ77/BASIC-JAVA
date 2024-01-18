public class Class2 {
    public static void main(String[] args)
    {
        int[] marks={101,102,103,104};
        //System.out.println(marks[1]); //OUTPUT 101

        /*for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
         */
        for (int element:marks)
        {
            System.out.println(element);
        }

    }
}
