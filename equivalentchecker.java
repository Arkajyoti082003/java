import java.util.*;
public class equivalentchecker
{
    public static void main(String[]args)
    {
        int a , b;
        System.out.println("enter two number");
        Scanner Sc = new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
            if (a == b)
            {
            System.out.println("a is equal to b");
            }
            else if(a > b)
            {
            System.out.println("a is greater than b");
            }
            else if(a < b)
            {
            System.out.println("b is greater than a");    
            }
    } 
}       