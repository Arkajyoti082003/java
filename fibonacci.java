import java.util.*;
public class fibonacci
{
    public static void main(String[] args)
    {
    int a , i , c=0 , d=1 ;
    System.out.println("enter the last limit of the fibonacci series");
    Scanner sc = new Scanner (System.in);
    a=sc.nextInt();
        for(i=0;i<=a;i++)
        {
            System.out.println("The Series runs as follows" + i);
            System.out.println("   " +c); 
            int b = d + c;
            c = d;
            d = b;
        }   
    }   
}