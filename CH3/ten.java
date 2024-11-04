package CH3;

import java.util.Scanner;

public class ten
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int b;
        int d;
        int e;
        b = keyin.nextInt();
        d = keyin.nextInt();
        e = keyin.nextInt();
        if((101*b-101*e-10*d)%101 == 0)
        {
            System.out.print(((101*b)-(101*e)-(10*d))/101);
        }
        else
        {
            System.out.print(-1);
        }
        keyin.close();
    }    
}
