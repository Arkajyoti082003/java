import java.util.*;
public class caseprinter
{
    public static void main(String[] args)
    {
        int a;
        System.out.println("enter the value of a to print the following case");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
            if(a == 1)
            {
                System.out.print("hello");
            }
            else if (a == 2)
            {
                System.out.print("Namaste");
            }
            else if (a == 3)
            {
                System.out.print("Bonjourno");
            }

    }
}