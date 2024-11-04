

import java.util.Scanner;

public class four
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        a = keyin.nextInt();
        System.out.print((a+1)*a/2+1);
        keyin.close();
    }    
}
