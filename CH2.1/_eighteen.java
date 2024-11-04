import java.util.Scanner;

public class _eighteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        int b;
        int c;
        a = keyin.nextLine();
        b = keyin.nextInt();
        c = keyin.nextInt();
        if(a.length() <= c-1)
        {
            System.out.print("error");
        }
        else
        {
            System.out.print(a.substring(b,c));
        }
        keyin.close();
    }
}
