import java.util.Scanner;

public class _six {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        int b;
        a = keyin.nextLine();
        b = keyin.nextInt();
        if(a.length() <= b)
        {
            System.out.print("error");
        }
        else
        {
            System.out.print(a.charAt(b));
        }
        keyin.close();
    }
}
