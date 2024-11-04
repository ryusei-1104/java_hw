

import java.text.DecimalFormat;
import java.util.Scanner;

public class eight {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        double a;
        a = keyin.nextDouble();
        System.out.print(new DecimalFormat("0.00%").format(a));
        keyin.close(); 

    }
}
