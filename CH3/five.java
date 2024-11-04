package CH3;

import java.util.Scanner;

public class five
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        a = keyin.nextInt();
        b = keyin.nextInt();
        c = keyin.nextInt();
        d = keyin.nextInt();
        System.out.print(b*c+d+1);
        keyin.close();
    }    
}
