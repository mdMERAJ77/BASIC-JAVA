import java.util.Scanner;
class Algebra{
  int add(int a, int b){
      return a+b;
  }

}
public class Main {
    public static void main(String[] args) {
      Algebra obj=new Algebra();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print("sum of two number is: ");
        int ans=obj.add(x,y);
        System.out.println(ans);
    }
}