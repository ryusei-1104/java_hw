import java.util.Scanner;

public class _three {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        a = keyin.next();
        b = keyin.next();
        if(a.equalsIgnoreCase(b))
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("0");
        }
        keyin.close();
    }
}
