
import java.util.Scanner;

public class two {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        int a;
        int b;
        a = keyin.nextInt();
        b = keyin.nextInt();
        System.out.printf("%d add %d are %d.", a,b,a+b);
        keyin.close(); 

    }
}