package CH2;
import java.util.Scanner;

public class fifteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        float a;
        a = keyin.nextFloat();
        System.out.print(Math.round(a*100)/10f);
        keyin.close(); 
    }
}
