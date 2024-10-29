package CH1;
import java.util.Scanner;
import java.lang.Math;

public class thirteen {
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        int n;
        n = keyin.nextInt();
        int ans;
        ans = (int)(Math.ceil((float)n / 0.238f));
        System.out.print(ans);   
    }
}
