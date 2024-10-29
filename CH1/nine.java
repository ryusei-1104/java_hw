package CH1;
import java.util.Scanner;

public class nine {
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        int candy = 0;
        int gumball = 0;
        int redeem = 0;
        redeem = keyin.nextInt();
        candy = redeem / 10;
        redeem = redeem - candy * 10;
        gumball = redeem / 3;
        redeem = redeem - gumball * 3;
        System.out.println(candy + " " + gumball + " " + redeem);      
    }
}