package CH2;
import java.util.Scanner;

public class seven {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        float a;
        float b;
        a = keyin.nextFloat();
        b = keyin.nextFloat();
        System.out.printf("%.2f",a/b);
        
        
        keyin.close(); 
    }
}