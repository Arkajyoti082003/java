import java .util.*;
public class evennumber
{
    public static void main(String args[])
    {
        int a,b;
        System.out.println(" Enter the ending value of loop");
        Scanner sc = new Scanner (System.in);
        b = sc.nextInt();
        for( a=0 ; a<=b ; a++)
        {
            if( a % 2 == 0 )
            {
                System.out.println("the even number are :"+a);
            }
            else if ( a % 2 != 0)
            {
                System.out.println("                               The odd numbers are : "+a);
            }
        }
    }
}
