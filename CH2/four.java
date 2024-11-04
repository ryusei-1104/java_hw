
import java.util.Scanner;
import java.lang.Math;

public class four {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        double a;
        a = keyin.nextDouble();
        System.out.print((int)Math.round((double)1/a));
        keyin.close(); 
    }
}
