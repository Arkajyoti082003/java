import java.util.*;
public class oddeven
{
    public static void main(String[]args)
    {
        int a;
        System.out.println("enter a number");
        Scanner Sc = new Scanner(System.in);
        a=Sc.nextInt();
        
            if (a % 2 == 0)
            {
            System.out.println("number is even");
            }
            else
            {
            System.out.printwln("number is odd");
            }
    }
}