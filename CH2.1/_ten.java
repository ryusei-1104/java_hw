import java.util.Scanner;

public class _ten {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        String c;
        a = keyin.nextLine();
        b = keyin.nextLine();
        c = keyin.nextLine();
        for(int i = 0;i <= a.length()-b.length();i++)
        {
            if(a.substring(i,i+b.length()).equals(b))
            {
                
                System.out.print(a.replaceAll(a.substring(i,i+b.length()), c));
                break;
            }
        }
        keyin.close();
    }
}
