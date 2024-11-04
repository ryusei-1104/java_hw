
import java.util.Scanner;

public class four {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        float a;
        a = keyin.nextFloat();
        System.out.printf("Start%10.2fEnd\n",a);
        System.out.printf("Start%-10.2fEnd",a);
        keyin.close(); 

    }
}
