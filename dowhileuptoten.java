import java .util.*;
public class dowhileuptoten
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting value of loop");
        a=sc.nextInt();
        System.out.println("Enter the ending value of loop");
        b=sc.nextInt();
        //Using do while loop to print numbers from 'a' to 'b' 
            do
            {
                System.out.println("    "+a);
                a=a+1;
            }
            while(a<=b);
    }
}