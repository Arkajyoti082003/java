 import java.util.*;
 public class whileloopuptoten
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,n;
        System.out.println("Enter the Starting value of loop");
        a=sc.nextInt();
        System.out.println("Enter the ending value of loop");
        n = sc.nextInt();
        while(a<=n)
        {
            System.out.println(+a);
            a=a+1;
        }
    }
 }