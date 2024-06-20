import java.util.*;
public class agechecker
{
    public static void main(String[]args)
    {
        int age;
        System.out.println("enter the age");
        Scanner Sc = new Scanner(System.in);34
        age=Sc.nextInt();
        if(age>=18)
        {
            System.out.println("the person is an Adult");
        }
        else
        {
            System.out.println("The person is not an Adult");
        }
    }
}










