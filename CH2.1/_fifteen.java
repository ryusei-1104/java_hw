import java.util.Scanner;

public class _fifteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.nextLine();
        for(int i = 0;i<a.length();i= i+3)
        {
            System.out.print(a.substring(i, i+1));
        }
        keyin.close();
    }
}
