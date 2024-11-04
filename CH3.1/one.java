

import java.util.Scanner;

public class one
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        a = keyin.nextInt();
        int b[] = new int[a];
        for(int i=0;i<a;i++)
        {
            b[i] = keyin.nextInt();
            if(b[i]>=40)
            {
                b[i] = 100;
            }
            else if (b[i]>=20) 
            {
                b[i] = 80 + b[i]-20;    
            }
            else if(b[i] >= 10)
            {
                b[i] = 60 + 2*(b[i]-10);
            }
            else
            {
                b[i] = 6 * b[i];
            }
        }
        for(int i=0;i<a;i++)
        {
            if(i == a-1)
            {
                System.out.print(b[i]);
                break;
            }
            System.out.println(b[i]);
        }
        keyin.close();
    }    
}
