package CH3;

import java.util.Scanner;

public class eleven
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int g = 0;
        int h = 0;
        int i = 0;
        a = keyin.nextInt();
        b = keyin.nextInt();
        c = keyin.nextInt();
        d = keyin.nextInt();
        e = keyin.nextInt();
        h = (d-c+10)%10;
        g = 11*e - (a+((b+c)/10));
        i = (b+c)%10+(c+h)/10;
        if(h>=0 && g>=0 && i>=0)
        {
            System.out.println(g);
            System.out.println(h);
            System.out.print(i);
        }
        else
        {
            System.out.print("-1");
        }
        keyin.close();
    }    
}
