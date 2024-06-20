import java.util.*;
public class palindrome
{
    public static void main(String[] args)
    {
        int n , revnum = 0 , rem ,x ; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you ant to check whether it is palindrome or not");
        n=sc.nextInt();
        x=n;
        while(n != 0)
        {
            rem = n % 10;
            revnum = (revnum * 10) + rem ;
            n = n / 10;               
        }
        System.out.println("The entered number is"+x);
        System.out.println("The reversed number is"+revnum);

        if(x == revnum)
        {
            System.out.println(" The number entered is palindrome");
        }
        else
        {
            System.out.println(" The number entered is not palindrome");
        }
    }
}