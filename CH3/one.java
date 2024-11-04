package CH3;
import java.util.Scanner;

public class one {
    public static void main(String []arg)
    {
         float a = 0f;
         float ans = 0f;
         Scanner keyin = new Scanner(System.in);
         a = keyin.nextFloat();
         if(a > 30000)
         {
            ans = (a-30000.0f)*0.1f + 750.0f;
         }
         else if (a>15000) 
         {
            ans = (a-15000)*0.05f;   
         }
         System.out.printf("%.2f",ans);
         keyin.close();
    }
}
