
import java.util.Scanner;
import java.lang.Math;

public class five {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        double a;
        a = keyin.nextDouble();
        System.out.printf("%.2f",14+Math.log(a)/Math.log(10));
        keyin.close(); 
    }
}
