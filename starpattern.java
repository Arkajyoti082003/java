import java.util.*;
public class starpattern
{
    public static void main(String[] args)
    {
        int line , star , n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to countinue your pattern ");
        n = sc.nextInt();
        for(line = 1 ; line <= n ; line++)
        {
            for(star = 1 ; star <= line ; star++)
            {
            System.out.print(" @ ");
            }
            System.out.println("  ");
        }
    }
}