import java.util.*;
public class sumnatural
{
    public static void main(String[] args)
    {
    int a,b,sum = 0,n;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number from which you want to calculate the sum");
    n=sc.nextInt();
    System.out.println("Enter the value upto which you want the see the series of natural number");
    a=sc.nextInt();
        for(b=n;b<=a;b++)
        {
            System.out.print("  "+ b);
            sum = sum + b;
            System.out.println("       the sum of the series is :  "+ sum);
          
        }
        
    }    
}