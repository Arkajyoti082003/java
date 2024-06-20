import java.util.*;
public class multiplicationtable
{
    public static void main(String[] args)
    {
        int a , n , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplictaion table you want to calculate");
        b=sc.nextInt();
        System.out.println("Enter the number upto which you want to calculate the table");
        a=sc.nextInt();
        for(n=0;n<=a;n++)
        {
            int j = b * n ;
            System.out.println(b+"*"+n+"="+b*n);
        }
    }
}