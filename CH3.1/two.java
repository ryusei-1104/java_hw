

import java.util.Scanner;

public class two
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        int b;
        a = keyin.nextInt();
        b = keyin.nextInt();
        if(b == 0)
        {
            System.out.print("X");
        }
        for(int i = 0;i<b;i++)
        {
            if(a == 0)
            {
                System.out.print("X");
                break;
            }
            int count = 1;
            for(int j = 1;j<=a;j++)
            {
                for(int k = 1;k<=j;k++)
                {
                    System.out.print(count);
                }
                System.out.println();
                count++;
            }
            count = count-2;
            for(int j = a-1;j>=1;j--)
            {
                for(int k = j;k>=1;k--)
                {
                    System.out.print(count);
                }
                if(count == 1 && i == b-1)
                {
                    break;
                }
                System.out.println();
                count--;
            }
            if(i == b-1)
            {
                //System.out.println(i + "    "+ b);
                break;
            }
            //System.out.println(i + "_____"+ b);
            System.out.println();
        }
        keyin.close();
    }    
}
