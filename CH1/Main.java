package CH1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        double up = 0;
        double down = 0;
        double high = 0;
        double ans = 0;
        up = keyin.nextDouble();
        down = keyin.nextDouble();
        high = keyin.nextDouble();
        ans = (up + down) * high / 2.0;
        ans = Math.floor(ans*10.0) /10.0;
        System.out.println(ans);      
    }
}
