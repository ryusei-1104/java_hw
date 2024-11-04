import java.util.Scanner;

public class _eight {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        int find = 0;
        a = keyin.next();
        b = keyin.next();
        for(int i = 0;i <= a.length()-b.length();i++)
        {
            if(a.substring(i,i+b.length()).equals(b))
            {
                find = 1;
                System.out.print(i);
                break;
            }
        }
        if(find == 0)
        {
            System.out.print("-1");
        }
        keyin.close();
    }
}
