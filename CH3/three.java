package CH3;

import java.util.Scanner;

public class three
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        int count = 1;
        a = keyin.nextInt();
        for(int i = 0;i<a;i++)
        {
            for(int j = 0;j<a-(count/2+1);j++)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<count;j++)
            {
                if(j ==count-1 && i!=a-1)
                    System.out.println("*");
                else
                    System.out.print("*");
            }
            count = count+2;
        }
        keyin.close();
    }    
}
