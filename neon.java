import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class neon
{
    public static void main(String[] args)
    {
        int n , sum = 0 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you wnat to check whether it is neon or not");
        n=sc.nextInt();
        int sq = n * n ;
        System.out.println("the square of the number is :" +sq);
        while(sq!=0)
        {
            int j = sq % 10 ; // remainder is found out 
            System.out.println("The Remainder Is : " +j);
            sum = sum + j;   // adding the remainder to the sum 
            System.out.println("The Sum is :" +sum);
            sq = sq / 10 ;  // removing the last digit from the aquare of the number

        }
        if (sum == n)
        {
            System.out.println("The number is a neon number ");
        }
        else
        {
            System.out.println(" The number is not a neon number have a BEER ! ");
        }
        
    }
}