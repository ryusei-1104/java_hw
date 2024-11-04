
import java.util.Scanner;

public class fourteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        Long a;
        a = keyin.nextLong();
        a = a / 1000;
        System.out.print(a/86400);
        System.out.print(" ");
        a = a % 86400;
        System.out.print(a/3600);
        System.out.print(" ");
        a = a % 3600;
        System.out.print(a/60);
        System.out.print(" ");
        a = a % 60;
        System.out.print(a);
    
        
        keyin.close(); 
    }
}
