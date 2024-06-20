import java .util.*;
import java.io.*;
public class marks
{
    public static void main(String[]args)
    {
        int marks , cond;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Condition");
        cond =sc.nextInt();
        if (cond == 1)
        {
            System.out.println("Enter the MARKS of the student");
            marks =sc.nextInt();
                if(marks>=90)
                {
                    System.out.println(" excellent");
                }
                else if(marks>=70 && marks<=90)
                {
                    System.out.println("very good");
                }
                else
                {
                    System.out.println("need improvement");
                }
        }
        else if (cond == 0)
        {
            System.out.println(" invalid ");
        } 
    }
}