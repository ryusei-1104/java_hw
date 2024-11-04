package CH3;

import java.util.Scanner;

public class six
{
    public static void main(String[] arg)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        int atemp = 0;
        int btemp = 0;
        a = keyin.next();
        b = keyin.next();
        for(int i = 0;i<a.length();i++)
        {
            int temp1 = a.charAt(i) - 'A';
            atemp = atemp * 10 + temp1;
            int temp2 = b.charAt(i) - 'A';
            btemp = btemp * 10 + temp2;
        }
        System.out.print(atemp+btemp);
        
        keyin.close();
    }    
}
