package CH3;

import java.util.Scanner;

public class two 
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        String a[] = new String[5];
        for(int i = 0;i<5;i++)
        {
            a[i] = keyin.next();
        }
        for(int i = 0;i<5;i++)
        {
            if(a[i].compareTo("a")>=0 && a[i].compareTo("e") <= 0)
            {
                if(i == 4)
                {
                    System.out.print(a[i].toUpperCase());
                }
                else
                {
                    System.out.print(a[i].toUpperCase()+ " ");
                }
                
            }
            else
            {
                if(i == 4)
                {
                    System.out.print("Z");
                }
                else
                {
                    System.out.print("Z ");
                }
            }
        }
        keyin.close();
    }    
}
