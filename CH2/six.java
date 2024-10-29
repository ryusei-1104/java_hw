package CH2;
import java.util.Scanner;

public class six {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.nextLine();
        Scanner N = new Scanner(a);
        String b;
        b = keyin.nextLine();
        N.useDelimiter(b);
        while (N.hasNext())
        {
            System.out.println(N.next());    
        }
        
        
        keyin.close(); 
    }
}
