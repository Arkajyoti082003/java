import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number hose factorial you want to find");
        n = sc.nextInt();
        for(int i=1; i<=n ; i++)
        {
            if( n % i == 0)
            {
                System.out.println("the factors of the entered number are :"+i);
            }            
        }
    }
}