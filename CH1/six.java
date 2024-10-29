package CH1;
import java.util.Scanner;

public class six {
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        double high = 0;
        double weight = 0;
        double bmi = 0;
        high = keyin.nextInt();
        weight = keyin.nextInt();
        high = high / 100;
        bmi = weight /(high*high);
        bmi = Math.floor(bmi*10) /10;
        System.out.println(bmi);      
    }
}