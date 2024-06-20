import java.util.*;
public class primenumber
 {
    public static void main (String[] args)
    {
        int a , b , count=0 ;
        System.out.println("enter the number you want to check");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for (b=1;b<=a;b++)
        {
            if (a % b == 0)
            {
                System.out.println("the factors of the number are : " +b);
                count=count+1;
            }
        }
        if( count == 2 )
                {
                    System.out.println("The entered number is a prime number.");
                }
                else
                {
                    System.out.println("The entered number is not a prime");
                } 
    }
}