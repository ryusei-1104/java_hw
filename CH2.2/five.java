
import java.text.DecimalFormat;
import java.util.Scanner;

public class five {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        float a;
        a = keyin.nextFloat();
        System.out.print("NT$" + new DecimalFormat("#,###.00").format(a));
        keyin.close(); 

    }
}
