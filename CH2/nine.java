
import java.util.Scanner;

public class nine {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.nextLine();
        Scanner N = new Scanner(a);
        String b = "#";
        String temp;
        N.useDelimiter(b);
        System.out.print(N.next()); 
        temp = N.next();
        System.out.print(N.next());
        
        
        keyin.close(); 
        N.close();
    }
}
