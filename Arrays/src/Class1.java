// There are three ways to create an array in java
public class Class1 {
    public static void main(String[] args) {
    /* (Declaration)
       (Memory Allocation)
        int[] marks;
        marks=new int[5];
        marks[0]=100;
        marks[1]=101;
        marks[2]=103;
        marks[3]=104;
        System.out.println(marks[2]); //Output 103
     */

    /* (Declaration + Memory Allocation)
        int[] marks = new int[5];
        marks[0]=100;
        marks[1]=101;
        marks[2]=103;
        marks[3]=104;
        System.out.println(marks[3]); //OUTPUT 104
     */

        //(Declaration + Memory Allocation + Initialization)

        //int[] marks={100,101,102,103};
        //System.out.println(marks[1]); //OUTPUT 101

        //float[] marks={10.0f,1.01f,10.2f,10.3f};
        //System.out.println(marks[1]); //OUTPUT 1.01

        String[] name={"MERAJ","SAKIB","SARIK","SADIK"};
        System.out.println(name[2]);   //OUTPUT SARIK


    }
}