import java.util.*;
public class printonetoten
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ending value of loop");
        a=sc.nextInt();
            for(int b=1;b<=a;b++)
            {
            System.out.println("   "+b);
            }
    }
}