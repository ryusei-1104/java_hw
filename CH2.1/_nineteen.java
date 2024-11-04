import java.util.Scanner;

public class _nineteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        String c;
        a = keyin.nextLine();
        b = keyin.nextLine();
        c = keyin.nextLine();
        for(int i = 0;i<=a.length()-b.length();i++)
        {
            if(a.substring(i, i+b.length()).equalsIgnoreCase(b))
            {
                a = a.replaceAll(a.substring(i, i+b.length()),b);
            }
        }
        System.out.print(a.replaceAll(b, c));
        keyin.close();
    }
}
