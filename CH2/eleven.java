package CH2;
import java.util.Scanner;

public class eleven {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        String a;
        String b;
        String c;
        a = keyin.nextLine();
        b = keyin.nextLine();
        c = keyin.nextLine();
        System.out.print(a+b+c);
        
        
        keyin.close(); 
    }
}
