import java.util.*;
public class calculator
{
    public static void main(String[] args)
    {
        int a,b,calcfunc;
        System.out.println("enter the values of a,b");
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        System.out.println("Enter the function you want to initialise in the calculator");
        calcfunc=Sc.nextInt();
        switch(calcfunc)
        {
            case 1:
            int sum = (a+b);
            System.out.println("the sum is "+ sum);
            break;

            case 2 :
                if(a>b)
                {
                    int diff = (a-b);
                    {
                    System.out.println("the difference is:"+ diff);    
                    } 
                }
                else
                {
                    int diff = (b-a);
                    {
                    System.out.println("the difference is:"+ diff);     
                    }     
                }
                break;
                
            case 3 :
            int product = (a*b);
            System.out.println("The product is :" + product);
            break;
            
            case 4:
            if(a>b)
                {
                    double quo = (a/b);
                    {
                    System.out.println("the qoutient is:"+ quo);
                    }
                }
                else
                {
                      int quo = (b/a);
                    {
                    System.out.println("the quotient is:"+ quo);
                    }     
                } 
                break;   
            
            default:
            System.out.println("invalid input , Please enter the choice between 1 and 4 ");    
            break;    
        }     
    }
}