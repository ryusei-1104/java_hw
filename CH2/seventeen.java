package CH2;
import java.util.Scanner;

public class seventeen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        a = keyin.nextLine();
        Scanner N = new Scanner(a);
        N.useDelimiter("#");
        while (N.hasNext())
        {
            System.out.println(N.next());    
        }
        
        
        keyin.close(); 
        N.close();
    }
}
