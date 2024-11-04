

import java.util.Scanner;

public class three
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        a = keyin.nextInt();
        if((a/100)*(a/100)*(a/100)+((a%100)/10)*((a%100)/10)*((a%100)/10)+(a%10)*(a%10)*(a%10) == a)
        {
            System.out.print("YES");
        }
        else
            System.out.print("NO");
        
        keyin.close();
    }    
}
