

import java.text.DecimalFormat;
import java.util.Scanner;

public class nine {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        double a;
        a = keyin.nextDouble();
        System.out.print(new DecimalFormat("0.###").format(a));
        keyin.close(); 

    }
}
