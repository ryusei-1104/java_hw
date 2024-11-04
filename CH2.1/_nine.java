import java.util.Scanner;

public class _nine {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        int n = 0;
        a = keyin.next();
        b = keyin.next();
        n = a.compareTo(b);
        if(n == 0)
        {
            System.out.print("0");
        }
        else if (n<0)
        {
            System.out.print(b);            
        }
        else
        {
            System.out.print(a);
        }
        keyin.close();
    }
}
