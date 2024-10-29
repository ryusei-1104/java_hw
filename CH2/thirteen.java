package CH2;
import java.util.Scanner;

public class thirteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        Long a;
        a = keyin.nextLong();
        System.out.print(a%10);
    
        
        keyin.close(); 
    }
}
