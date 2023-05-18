import java.util.*;
class Main
{
    public static void main (String args[])
    {
        System.out.println("enter 5 subject numbers");
        Scanner sc=new Scanner (System.in);
       
        String str="summation of all 5 subject";
        int maths=sc.nextInt();
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int biology=sc.nextInt();
        int pps=sc.nextInt();
        int sum,percentage;
        sum=(maths+chemistry+physics+pps+biology);
        percentage=(sum/5);
        System.out.println( sum);
        System.out.println(  percentage);
        
    }
}