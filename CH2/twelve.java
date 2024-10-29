package CH2;
import java.util.Scanner;

public class twelve {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.nextLine();
        Scanner N = new Scanner(a);
        N.useDelimiter(" ");
        String ans;
        ans = N.next();
        System.out.println(N.next());
        System.out.print(N.next());
        while (N.hasNext()) 
        {
            System.out.print(" " + N.next());
        }
    
        
        keyin.close(); 
        N.close();
    }
}
