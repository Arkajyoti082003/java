import java.util.*;
public class switchprint
{
    public static void main(String[] args)
    {
    int x ;
    System.out.println("enter the value of x");
    Scanner Sc = new Scanner(System.in);
    x=Sc.nextInt();
        switch(x)
        {
        case 1:
        System.out.println("Hello");
        break;
        case 2:
        System.out.println("Namaste");
        break;
        case 3:
        System.out.println("Bonjourno");
        break;
        default:
        System.out.println("Invalid input");
        break;
        }
    }
}