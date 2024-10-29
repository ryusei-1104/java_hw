package CH1;
import java.util.Scanner;

public class fourteen {
    
    public static void main(String[] args)
    {
        Scanner keyin = new Scanner(System.in);
        int n;
        n = keyin.nextInt();
        int ans;
        ans =   (n / 60) % 60;
        System.out.print(ans);   
    }
}
