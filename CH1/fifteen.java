package CH1;
import java.util.Scanner;

public class fifteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        int b;
        a = keyin.nextInt();
        b = keyin.nextInt();
        if((a*a + b*b) <= 10000)
        {
            System.out.print("inside");
        }
        else
        {
            System.out.print("outside");
        }   
    }
}
